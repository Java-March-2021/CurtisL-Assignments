package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	long countByDojoLike(Dojo dojo);
	
	List<Ninja> findAllByDojoLike(Dojo dojo);
	
}
