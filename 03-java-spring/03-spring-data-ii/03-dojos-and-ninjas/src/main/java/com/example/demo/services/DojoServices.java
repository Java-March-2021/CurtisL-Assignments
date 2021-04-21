package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Dojo;
import com.example.demo.repositories.DojoRepository;
import com.example.demo.repositories.NinjaRepository;

@Service
public class DojoServices implements DojoRepository {
	
	@Autowired
	DojoRepository dRepo;
	@Autowired
	NinjaRepository nRepo;

	@Override
	public <S extends Dojo> S save(S entity) {
		// TODO Auto-generated method stub
		return dRepo.save(entity);
	}

	@Override
	public <S extends Dojo> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Dojo> findById(Long id) {
		// TODO Auto-generated method stub
		return dRepo.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return dRepo.existsById(id);
	}

	@Override
	public Iterable<Dojo> findAll() {
		// TODO Auto-generated method stub
		return dRepo.findAll();
	}

	@Override
	public Iterable<Dojo> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return dRepo.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return dRepo.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dRepo.deleteById(id);
	}

	@Override
	public void delete(Dojo entity) {
		// TODO Auto-generated method stub
		dRepo.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Dojo> entities) {
		// TODO Auto-generated method stub
		dRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dRepo.deleteAll();
	}

}
