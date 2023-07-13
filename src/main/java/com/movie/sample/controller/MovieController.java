package com.movie.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.sample.dto.MovieDto;
import com.movie.sample.responseStructure.ResponseStructure;
import com.movie.sample.serviceImpl.MovieServiceImpl;

@RestController
@CrossOrigin
public class MovieController {
	@Autowired
	private MovieServiceImpl movieServiceImpl;

	@PostMapping("/addMovie")
	public ResponseEntity<?> addMovieInfo(@RequestBody MovieDto movieDto)
	{
		ResponseStructure<?> responseStructure=movieServiceImpl.addMovieInfo(movieDto);
        return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
				//		return movieServiceImpl.addMovieInfo(movieDto);
	}
	@GetMapping("/fetch")
	public List<MovieDto> getAllMovie()
	{
//		ResponseStructure<?> responseStructure=movieServiceImpl.getAllMovie();
//		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		return movieServiceImpl.getAllMovie();
	}
	@DeleteMapping(path="/delete/{id}")
	public MovieDto deleteById(@PathVariable int id) {
//		ResponseStructure<?> responseStructure=movieServiceImpl.deleteById(id);
//		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		return movieServiceImpl.deleteById(id);
	}
	@PutMapping("/update")
	public MovieDto udateMovieInfo(@RequestBody MovieDto movieDto)
	{
//		ResponseStructure<?> responseStructure=movieServiceImpl.updateMovieInfo(movieDto);
//		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		return movieServiceImpl.updateMovieInfo(movieDto);
	}
	@GetMapping("getByid")
	public MovieDto moviegetById(@RequestParam int id)
	{
//		ResponseStructure<?> responseStructure=movieServiceImpl.moviegetByid(id);
//		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		return movieServiceImpl.moviegetByid(id);
		
	}
	
}
