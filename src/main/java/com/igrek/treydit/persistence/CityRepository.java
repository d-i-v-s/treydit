package com.igrek.treydit.persistence;

import com.igrek.treydit.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {


    List<City> findByName(String name);
}
