package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository <Language, Long> {
	
	List<Language> findAll(); //find all languages in language table
	
	List<Language> findByName(String name);
	
	List<Language> findByCreator(String creator);
	
	List<Language> findByCurrentVersion(String version);
	
	

}
