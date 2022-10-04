package com.blogger.travelling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.travelling.model.TypeOfPlace;
import com.blogger.travelling.service.TypeOfPlaceService;

@RestController
@RequestMapping("/place")
public class TypeOfPlaceController {
	
	@Autowired
	TypeOfPlaceService tps;
	
	@GetMapping("{id}")
	public TypeOfPlace getPlaceById(@PathVariable int id)
	{
		return tps.getPlaceById(id);
	}
	@GetMapping
	public List<TypeOfPlace> getAllPace()
	{
		return tps.getAllPlace();
	}
	
	@PostMapping
	public void savePlace(@RequestBody TypeOfPlace typeOfPlace)
	{
		tps.savePlace(typeOfPlace);
	}
	
	@GetMapping("/type/{type}")
	public TypeOfPlace getPlaceById(@PathVariable String type)
	{
		return tps.getTypeOfPlaceByType(type);
	}
}
