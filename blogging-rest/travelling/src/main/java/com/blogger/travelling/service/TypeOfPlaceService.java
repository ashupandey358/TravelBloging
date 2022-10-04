package com.blogger.travelling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.travelling.model.TypeOfPlace;
import com.blogger.travelling.repository.TypeOfPlaceRepository;

@Service
public class TypeOfPlaceService {

	
	@Autowired
	TypeOfPlaceRepository tpr;
	
	public TypeOfPlace getPlaceById(int id)
	{
		Optional<TypeOfPlace> top = tpr.findById(id);
		return top.get();
	}
	
	public List<TypeOfPlace> getAllPlace() {
		return tpr.findAll();
	}
	
	public void savePlace(TypeOfPlace typeOfPlace)
	{
		tpr.save(typeOfPlace);
	}
	
	public TypeOfPlace getTypeOfPlaceByType(String type) {
		return tpr.getTypeOfplace(type);
	}
}
