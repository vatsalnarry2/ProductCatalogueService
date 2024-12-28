package com.example.productcatalogueservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ControllerAdvice {
	
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String > handleException(Exception exception)
    {
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);}

}
