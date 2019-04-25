package com.cg.main.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class ExceptionHandler {
private final Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)  
    public ResponseEntity<Exception> handleBaseException(Exception e){     	
    	
    	slf4jLogger.error("Checked exception occurred",e);
    	Exception result = new Exception();
    	if(e.hashCode() == 204) {
    		return new ResponseEntity<>(result,HttpStatus.NO_CONTENT);
    	}
    		else {
			 
    		return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
    	}

    } 

}
