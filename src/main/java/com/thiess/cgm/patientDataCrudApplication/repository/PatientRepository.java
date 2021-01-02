package com.thiess.cgm.patientDataCrudApplication.repository;

import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByLastNameContaining(String lastName);
}
