package com.movie.sample.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MovieDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String movieName;
private String hero;
private String heroine;
private String director;
private String languages;
private String genre;
private String poster;
private String trailer;
private String releaseDate;
private Double rating;
private String synopsis;
}
