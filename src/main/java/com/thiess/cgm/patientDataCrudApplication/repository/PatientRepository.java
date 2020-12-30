package com.thiess.cgm.patientDataCrudApplication.repository;

import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
