package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Song;
import com.example.demo.repositories.SongRepository;

@Service
public class SongServices implements SongRepository {
	
	@Autowired
	SongRepository sRepo;

	@Override
	public <S extends Song> S save(S entity) {
		// TODO Auto-generated method stub
		sRepo.save(entity);
		return null;
	}

	@Override
	public <S extends Song> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Song> findById(Long id) {
		// TODO Auto-generated method stub
		return sRepo.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return sRepo.existsById(id);
	}

	@Override
	public Iterable<Song> findAllById(Iterable<Long> ids) {
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
		sRepo.deleteById(id);
	}

	@Override
	public void delete(Song entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Song> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Song> findAll() {
		// TODO Auto-generated method stub
		return sRepo.findAll();
				
	}

	public List<Song> findByArtistContaining(String artist) {
		// TODO Auto-generated method stub
		return sRepo.findByArtistContaining(artist);
	}



	public List<Song> findTop10ByRating(int rating) {
		// TODO Auto-generated method stub
		return sRepo.findTop10ByRating(rating);
	}

	public List<Song> findTop10ByOrderByRatingDesc() {
		// TODO Auto-generated method stub
		return sRepo.findTop10ByOrderByRatingDesc();
	}

}
