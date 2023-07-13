package com.movie.sample.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.movie.sample.dao.MovieDao;
import com.movie.sample.dto.MovieDto;
import com.movie.sample.responseStructure.ResponseStructure;
@Service
public class MovieServiceImpl {
	@Autowired
private MovieDao movieDao; 
	public ResponseStructure<?> addMovieInfo(MovieDto movieDto) {
		MovieDto dto=movieDao.addMovieInfo(movieDto);
		ResponseStructure<MovieDto> responseStructure=new ResponseStructure<>();
		responseStructure.setData(dto);
		responseStructure.setHttpStatus(HttpStatus.CREATED);
		return responseStructure;
//		return movieDao.addMovieInfo(movieDto);
	}
	public List<MovieDto> getAllMovie() {
//		List<MovieDto> dtos=movieDao.getAllMovie();
//		ResponseStructure<List<MovieDto>> responseStructure=new ResponseStructure<>();
//		responseStructure.setData(dtos);
//		responseStructure.setHttpStatus(HttpStatus.FOUND);
//		return responseStructure;
		return movieDao.getAllMovie();
	}
	public MovieDto deleteById(int id) {
//		MovieDto dto=movieDao.deleteById(id);
//		ResponseStructure<MovieDto> responseStructure=new ResponseStructure<>();
//		responseStructure.setData(dto);
//		responseStructure.setHttpStatus(HttpStatus.OK);
//		return responseStructure;
		return movieDao.deleteById(id);
	}
	public MovieDto updateMovieInfo(MovieDto movieDto) {
		MovieDto mov=movieDao.updateMovieInfo(movieDto);
//		ResponseStructure<MovieDto> responseStructure=new ResponseStructure<>();
//		responseStructure.setData(mov);
//		responseStructure.setHttpStatus(HttpStatus.ACCEPTED);
//		return responseStructure;
		return mov;
	}
	public MovieDto moviegetByid(int id) {
//		MovieDto dto=movieDao.moviegetByid(id);
//		ResponseStructure<MovieDto> responseStructure=new ResponseStructure<>();
//		responseStructure.setData(dto);
//		responseStructure.setHttpStatus(HttpStatus.FOUND);
//		return responseStructure;
		return movieDao.moviegetByid(id);
	}
	
}
