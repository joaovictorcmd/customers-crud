package com.github.joaovictorcmd.customerscrud.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author joaovictorcmd
 * @date 2024 Sep 25
 */
public class ValidationError extends CustomError {
    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
