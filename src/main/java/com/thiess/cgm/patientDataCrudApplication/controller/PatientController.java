package com.thiess.cgm.patientDataCrudApplication.controller;

import com.thiess.cgm.patientDataCrudApplication.PatientNotFoundException;
import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import com.thiess.cgm.patientDataCrudApplication.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    private final PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/patients")
    List<Patient> all() {
        return repository.findAll();
    }

    @PostMapping("/patients")
    Patient newPatient(@RequestBody Patient newPatient) {
        return repository.save(newPatient);
    }

    @GetMapping("/employees/{id}")
    Patient one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

    @PutMapping("/patients/{id}")
    Patient replaceEmployee(@RequestBody Patient newPatient, @PathVariable Long id) {
        return repository.findById(id)
                .map(patient -> {
                    patient.setFirstName(newPatient.getFirstName());
                    patient.setLastName(newPatient.getLastName());
                    patient.setCity(newPatient.getCity());
                    patient.setStreet(newPatient.getStreet());
                    return repository.save(patient);
                })
                .orElseGet(() -> {
                    newPatient.setId(id);
                    return repository.save(newPatient);
                });
    }

    @DeleteMapping("/patients/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
