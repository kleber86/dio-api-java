package com.cities.apicities;

import com.cities.apicities.countries.Country;
import com.cities.apicities.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coutries")
public class CountryResource {

    private CountryRepository repository;

    public  CountryResource(CountryRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries(){

        return repository.findAll();
    }

}
