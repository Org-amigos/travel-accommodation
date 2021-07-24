package com.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.model.Cities;
import com.travel.repository.CityDao;

@Service
public class CityService {

	@Autowired
	CityDao cityDao;

	public Cities saveCity(Cities cities) {

		return cityDao.save(cities);
	}

	public List<Cities> fetchAll() {

		return cityDao.findAll();
	}

	public Cities getParticular(Integer cityId) {
		// TODO Auto-generated method stub
		return cityDao.findById(cityId).get();
	}

	public void deleteCity(Integer cityId) {

		cityDao.deleteById(cityId);
	}

}
