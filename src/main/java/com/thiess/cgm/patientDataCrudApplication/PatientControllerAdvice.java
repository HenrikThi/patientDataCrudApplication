package com.thiess.cgm.patientDataCrudApplication;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class PatientControllerAdvice {

    @ResponseBody
    @ExceptionHandler(DuplicatedPatientException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String duplicatedPatientHandler(DuplicatedPatientException ex){
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(PatientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String patientNotFoundHandler(PatientNotFoundException ex){
        return ex.getMessage();
    }

}
