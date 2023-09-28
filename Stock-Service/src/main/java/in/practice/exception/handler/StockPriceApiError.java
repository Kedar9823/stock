package in.practice.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.practice.exception.StockNotFoundException;

@RestControllerAdvice
public class StockPriceApiError {

	@ExceptionHandler(value=StockNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(StockNotFoundException se){
		return new ResponseEntity<String>(se.getMessage(),HttpStatus.NOT_FOUND);
	}
}
