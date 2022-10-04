package com.blogger.travelling.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.travelling.model.City;
import com.blogger.travelling.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);
	@Autowired
	CityService cs;

	@GetMapping("/{id}")
	public List<City> getCityById(@PathVariable int id) {
		LOGGER.debug("{}", id);
		
		return cs.getCityByPlaceID(id);
		
	}
	
}
