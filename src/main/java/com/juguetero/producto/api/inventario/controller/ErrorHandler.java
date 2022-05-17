package com.juguetero.producto.api.inventario.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.juguetero.producto.api.inventario.dto.ErrorDto;
import com.juguetero.producto.inventario.exception.InventarioException;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDto> methodArgumentNotValidEx(MethodArgumentNotValidException ex) {

		BindingResult result = ex.getBindingResult();
		List<FieldError> fieldsEr = result.getFieldErrors();

		StringBuilder msg = new StringBuilder();
		fieldsEr.forEach(x -> msg.append(x.getField() + " " + x.getDefaultMessage() + ", "));

		ErrorDto errorDto = new ErrorDto("050", msg.toString());
		return new ResponseEntity<ErrorDto>(errorDto, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InventarioException.class)
	public ResponseEntity<ErrorDto> inventarioExceptionHandler(InventarioException ex) {
		ErrorDto errorDto = new ErrorDto(ex.getCode(), ex.getMensaje());
		return new ResponseEntity<ErrorDto>(errorDto, HttpStatus.CONFLICT);
	}

}
