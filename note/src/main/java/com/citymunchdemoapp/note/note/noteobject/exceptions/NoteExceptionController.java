package com.citymunchdemoapp.note.note.noteobject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NoteExceptionController {
   @ExceptionHandler(value = NoteException.class)
   public ResponseEntity<Object> exception(NoteException exception) {
      return new ResponseEntity<>("Note Exception", HttpStatus.BAD_REQUEST);
   }
}