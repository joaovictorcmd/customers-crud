package com.github.joaovictorcmd.customerscrud.services.exceptions;

/**
 * @author joaovictorcmd
 * @date 2024 Sep 25
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
