package br.com.myspringtests.myspringtests.herotest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
   ResponseEntity<Object> heroName(MethodArgumentNotValidException e){
    return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE.value()).body(e.getBindingResult().getFieldError().getDefaultMessage());

    }
}
