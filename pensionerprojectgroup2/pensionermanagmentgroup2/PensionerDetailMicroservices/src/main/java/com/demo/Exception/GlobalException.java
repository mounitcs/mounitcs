package com.demo.Exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;


import org.apache.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalException extends  ResponseEntityExceptionHandler{

	@ExceptionHandler(AuthorizationException.class)
	public ResponseEntity<Exception> handleAuthorizationException(AuthorizationException ex){
		ExceptionDetail exceptionDetail = new ExceptionDetail(LocalDateTime.now(), HttpStatus.FORBIDDEN, ex.getMessage());
		log.error(ex.getMessage());
		return new ResponseEntity<>(exceptionDetail, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(MissingRequestHeaderException.class)
	public ResponseEntity<ExceptionDetail> handleMissingRequestHeaderException(MissingRequestHeaderException ex){
		ExceptionDetail exceptionDetail = new ExceptionDetail(LocalDateTime.now(), HttpStatus.BAD_REQUEST, ex.getMessage());
		log.error(ex.getMessage());
		return new ResponseEntity<>(exceptionDetail, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdhaarNotFound.class)
	public ResponseEntity<ExceptionDetail> handleMissingRequestHeaderException(AdhaarNotFound ex){
		ExceptionDetail exceptionDetail = new ExceptionDetail(LocalDateTime.now(), HttpStatus.NOT_FOUND, ex.getMessage());
		Log.error(ex.getMessage());
		return new ResponseEntity<>(exceptionDetail, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FeignException.class)
    public ResponseEntity<ExceptionDetail> handleFeignStatusException(FeignException ex, HttpServletResponse response) {
		log.error("handles by handleFeignStatusException");
		ExceptionDetail exceptionDetail = new ExceptionDetail(LocalDateTime.now(), HttpStatus.BAD_REQUEST, ex.getMessage());
		Log.error(ex.getMessage());
		return new ResponseEntity<>(exceptionDetail, HttpStatus.BAD_REQUEST);
    }
}
