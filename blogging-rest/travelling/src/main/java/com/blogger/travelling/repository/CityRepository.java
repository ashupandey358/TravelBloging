package com.blogger.travelling.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogger.travelling.model.City;



@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

	@Query("select c from City c where c.type_Of_Place.id = :id")
	public List<City> getCity(@Param("id") int id);
	
	
}
