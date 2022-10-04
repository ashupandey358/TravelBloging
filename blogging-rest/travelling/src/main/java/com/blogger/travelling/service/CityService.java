package com.blogger.travelling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.travelling.model.City;
import com.blogger.travelling.repository.CityRepository;

@Service
public class CityService {
	
	@Autowired
	CityRepository cr;
	
  public List<City> getCityByPlaceID(int id) {
	  
	  return cr.getCity(id);
		
	}

}
