package com.jciterceros.restClientAPI.services.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
