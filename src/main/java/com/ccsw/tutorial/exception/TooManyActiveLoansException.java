package com.ccsw.tutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author caliagaq
 *
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "A client can't have more than 2 active loans at the same time")
public class TooManyActiveLoansException extends RuntimeException {

    /**
     * Generated by Eclipse
     */
    private static final long serialVersionUID = -7887811975452079127L;

    public TooManyActiveLoansException(){
        super();
    }
    
    public TooManyActiveLoansException(String msg){
        super(msg);
    }
}
