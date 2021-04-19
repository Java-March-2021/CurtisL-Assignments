package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Language;
import com.example.demo.repositories.LanguageRepository;

@Service
public class LanguageServices implements LanguageRepository {
	
	@Autowired
	LanguageRepository langRepo;
	
	public void updateLanguage(Language lang) {
		langRepo.save(lang);
	}
	
	public void createLanguage(Language lang) {
		langRepo.save(lang);
	}

	@Override
	public <S extends Language> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Language> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Language> findById(Long id) {
		// TODO Auto-generated method stub
		return langRepo.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Language> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		langRepo.deleteById(id);
	}

	@Override
	public void delete(Language entity) {
		// TODO Auto-generated method stub
		langRepo.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Language> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Language> findAll() {
		// TODO Auto-generated method stub
		return langRepo.findAll();
		
	}

	@Override
	public List<Language> findByName(String name) {
		// TODO Auto-generated method stub
		return langRepo.findByName(name);
	}

	@Override
	public List<Language> findByCreator(String creator) {
		// TODO Auto-generated method stub
		return langRepo.findByCreator(creator);
	}

	@Override
	public List<Language> findByCurrentVersion(String version) {
		// TODO Auto-generated method stub
		return langRepo.findByCreator(version);
		
	}

}
