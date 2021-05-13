package com.cities.apicities.countries;

import com.cities.apicities.countries.Country;
import com.cities.apicities.countries.repository.CountryRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coutries")
public class CountryResource {

    private CountryRepository repository;

    public  CountryResource(CountryRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
