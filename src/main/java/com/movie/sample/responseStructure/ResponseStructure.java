package com.movie.sample.responseStructure;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class ResponseStructure<T> {
private T data;
private HttpStatus httpStatus;

}
