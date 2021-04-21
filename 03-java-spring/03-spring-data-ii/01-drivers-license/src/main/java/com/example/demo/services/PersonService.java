package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.License;
import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.repositories.LicenseRepository;

@Service
public class PersonService implements PersonRepository {
	
	@Autowired
	PersonRepository pRepo;
	
	@Autowired
	LicenseRepository lRepo;
	
	public List<Person> Unlicensed(){
		return pRepo.findByLicenseIdIsNull();
		
	}
	
	public License createLicense(License license) {
		license.setNumber(generateNumber());
		
		return lRepo.save(license);
	}
	
	public String generateNumber() {
		List<License> list = lRepo.findAllByOrderByNumberDesc();
		int number;
		
		if (list.isEmpty()||(list.get(0)==null)) {
			String num = "1000000";
			return num;
		}else {
		
		License l1 = list.get(0);
		number = Integer.parseInt(l1.getNumber());
		number++;
		String num = String.valueOf(number);
		return num;
		}
		
	}
	
	
	
	
	
//Person Repo
	@Override
	public <S extends Person> S save(S entity) {
		// TODO Auto-generated method stub
		return pRepo.save(entity);
	}

	@Override
	public <S extends Person> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return pRepo.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> findAllById(Iterable<Long> ids) {
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
		
	}

	@Override
	public void delete(Person entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Person> entities) {
		// TODO Auto-generated method stub
		pRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		pRepo.deleteAll();
	}

	@Override
	public List<Person> findByLicenseIdIsNull() {
		// TODO Auto-generated method stub
		return null;
	}

	public License findByPersonId(Long id) {
		// TODO Auto-generated method stub
		return lRepo.findByPersonId(id);
	}

	
	
	

}
