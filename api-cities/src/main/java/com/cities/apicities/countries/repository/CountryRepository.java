package com.cities.apicities.countries.repository;

import com.cities.apicities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
