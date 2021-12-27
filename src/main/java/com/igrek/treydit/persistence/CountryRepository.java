package com.igrek.treydit.persistence;

import com.igrek.treydit.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
    List<Country> findCountryByName(String name);
    Country findCountryById(Long id);

}
