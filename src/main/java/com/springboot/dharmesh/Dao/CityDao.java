package com.springboot.dharmesh.Dao;

import com.springboot.dharmesh.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
    public City findByCityName(String cityName);
}
