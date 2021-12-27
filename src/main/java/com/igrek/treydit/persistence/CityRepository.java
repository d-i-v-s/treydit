package com.igrek.treydit.persistence;

import com.igrek.treydit.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {


    List<City> findByName(String name);
    City findCityById(Long id);
}
