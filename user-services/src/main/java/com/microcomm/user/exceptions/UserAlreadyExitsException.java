package com.microcomm.user.exceptions;

public class UserAlreadyExitsException extends Exception{
    public UserAlreadyExitsException(String message)
    {
        super(message);
    }
}
