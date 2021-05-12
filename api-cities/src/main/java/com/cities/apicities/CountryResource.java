package com.cities.apicities;

import com.cities.apicities.countries.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coutries")
public class CountryResource {

    public List<Country> countries(){
        return "";
    }

}
