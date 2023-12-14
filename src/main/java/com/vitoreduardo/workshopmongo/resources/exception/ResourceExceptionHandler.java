package com.vitoreduardo.workshopmongo.resources.exception;

import com.vitoreduardo.workshopmongo.services.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        String error = "Object not found.";
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError standard = new StandardError(System.currentTimeMillis(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(standard);
    }
}
