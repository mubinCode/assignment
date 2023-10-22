package com.abdullah.crudoperations.controller;

// import java.net.http.HttpHeaders;
import java.util.InputMismatchException;

import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InputMismatchException.class)
    public ResponseEntity<String> inputMitmach(InputMismatchException ex){
        return new ResponseEntity<String>("Please check input", HttpStatus.NOT_ACCEPTABLE);
    }
    // @Override
    // protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
    //     pageNotFoundLogger.warn(ex.getMessage());
    //     return new ResponseEntity<Object>("Method type not supported.", HttpStatus.NOT_FOUND);
    //  }
  
    
}
