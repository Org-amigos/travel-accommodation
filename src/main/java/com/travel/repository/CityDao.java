package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.model.Cities;

public interface CityDao extends JpaRepository<Cities, Integer>{

}
