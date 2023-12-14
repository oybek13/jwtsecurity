package ok.team.jwtsecurity.exception.handler;

import ok.team.jwtsecurity.exception.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExcHandler {

    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<?> handler(UserAlreadyExistException ex) {
        return new ResponseEntity<>(new ErrorHandlerDto(ex.getMessage()), HttpStatus.NOT_ACCEPTABLE);
    }
}
