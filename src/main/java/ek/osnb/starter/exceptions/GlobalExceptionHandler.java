package ek.osnb.starter.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ProblemDetail> handleNotFound(NotFoundException ex) {
        // Create ProblemDetail for 404 Not Found
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        pd.setTitle("Todo not found");
        pd.setDetail(ex.getMessage());
        pd.setProperty("errorCode", "TODO_NOT_FOUND");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pd);
    }
}
