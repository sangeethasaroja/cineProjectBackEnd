package com.movie.sample.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movie.sample.dto.MovieDto;
import com.movie.sample.repo.MovieRepo;
@Repository
public class MovieDao {
	@Autowired
	private MovieRepo repo;

	public MovieDto addMovieInfo(MovieDto movieDto) {
		return repo.save(movieDto);
	}

	public List<MovieDto> getAllMovie() {
		return repo.findAll();
	}

	public MovieDto deleteById(int id) {
		Optional<MovieDto> movie=repo.findById(id);
		if(movie.isPresent())
		{
			repo.deleteById(id);
			return movie.get();
		}
		return null;
	}

	public MovieDto updateMovieInfo(MovieDto movieDto) {
		Optional<MovieDto> movieId=repo.findById(movieDto.getId());
		if(movieId.isPresent())
		{
			return repo.save(movieDto);
		}
		return null;
	}

	public MovieDto moviegetByid(int id) {
		Optional<MovieDto> movie=repo.findById(id);
		if(movie.isPresent())
		{
			return movie.get();
		}
		return null;
	}
	}

	
	

