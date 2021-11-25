package compulsory;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebRestControllerAdvice {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseMsg handleNotFoundException(IdNotFoundException ex) {
        ResponseMsg responseMsg = new ResponseMsg(ex.getMessage());
        return responseMsg;
    }

}
