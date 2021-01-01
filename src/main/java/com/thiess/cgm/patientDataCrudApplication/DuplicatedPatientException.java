package com.thiess.cgm.patientDataCrudApplication;

public class DuplicatedPatientException extends RuntimeException{
    public DuplicatedPatientException(){
        super("A patient with this patient information already exists.");
    }
}
