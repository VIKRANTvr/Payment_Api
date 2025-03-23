package com.payment_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	// Handle PaymentNotFoundException (404 Not Found)
	@ExceptionHandler(PaymentNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handlePaymentNotFoundException(PaymentNotFoundException ex) {
		logger.error("PaymentNotFoundException: {}", ex.getMessage());

		Map<String, Object> errorResponse = new HashMap<>();
		errorResponse.put("status", "error");
		errorResponse.put("message", ex.getMessage());
		errorResponse.put("errorType", "PaymentNotFoundException");

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}

	// Handle IllegalArgumentException (400 Bad Request)
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException ex) {
		logger.error("IllegalArgumentException: {}", ex.getMessage());

		Map<String, Object> errorResponse = new HashMap<>();
		errorResponse.put("status", "error");
		errorResponse.put("message", ex.getMessage());
		errorResponse.put("errorType", "IllegalArgumentException");

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}

	// Handle Generic Exception (500 Internal Server Error)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
		logger.error("Unexpected Exception: {}", ex.getMessage());

		Map<String, Object> errorResponse = new HashMap<>();
		errorResponse.put("status", "error");
		errorResponse.put("message", ex.getMessage());
		errorResponse.put("errorType", "GenericException");

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}
}
