package com.reservaya.reservams.exceptions;

import com.reservaya.reservams.models.Hotel;

public class HoteltNotFoundException extends RuntimeException{

    public HoteltNotFoundException(String message){
        super(message);
    }
}
