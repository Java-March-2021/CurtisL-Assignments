package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

	List<Song> findAll();

	List<Song> findByArtistContaining(String artist);

	
	List<Song> findTop10ByRating(int rating);

	List<Song> findTop10ByOrderByRatingDesc();

	
}
