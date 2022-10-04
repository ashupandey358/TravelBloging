package com.blogger.travelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogger.travelling.model.TypeOfPlace;

@Repository
public interface TypeOfPlaceRepository extends JpaRepository<TypeOfPlace, Integer>{
	@Query("select t from TypeOfPlace t where type = :typeOfplace")
	public TypeOfPlace getTypeOfplace(@Param("typeOfplace") String typeOfplace);

}
