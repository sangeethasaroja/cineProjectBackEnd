package com.movie.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.sample.dto.MovieDto;

public interface MovieRepo extends JpaRepository<MovieDto, Integer> {

}
