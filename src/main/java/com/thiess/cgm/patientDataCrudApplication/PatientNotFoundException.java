package com.thiess.cgm.patientDataCrudApplication;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(Long id){
        super("Could not find patient " + id);
    }
}
