package com.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.model.Cities;
import com.travel.service.CityService;

@RestController
@RequestMapping(value = { "/city" })
public class CityController {

	@Autowired
	CityService cityService;

	@PostMapping(value = "/save")
	public Cities saveCity(@RequestBody Cities cities) {
		return cityService.saveCity(cities);

	}

	@GetMapping(value = "/fetch")
	public List<Cities> fetchAll() {
		return cityService.fetchAll();

	}

	@PutMapping(value = "/getParticular")
	public Cities getParticular(@RequestParam(value = "cityId") Integer cityId) {
		return cityService.getParticular(cityId);

	}

	@DeleteMapping(value = "/delete")
	public void deleteCity(@RequestParam(value = "cityId") Integer cityId) {
		cityService.deleteCity(cityId);
	}

}
