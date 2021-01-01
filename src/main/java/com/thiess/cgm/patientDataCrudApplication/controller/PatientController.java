package com.thiess.cgm.patientDataCrudApplication.controller;

import com.thiess.cgm.patientDataCrudApplication.DuplicatedPatientException;
import com.thiess.cgm.patientDataCrudApplication.PatientNotFoundException;
import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import com.thiess.cgm.patientDataCrudApplication.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

    private final PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping("/patients")
    public List<Patient> all() {
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping("/patients")
    public Patient newPatient(@RequestBody Patient newPatient) {
        if (repository.findAll().contains(newPatient)) {
            throw new DuplicatedPatientException();
        } else {
            return repository.save(newPatient);
        }
    }

    @CrossOrigin
    @GetMapping("/patients/{id}")
    public Patient one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

    @CrossOrigin
    @PutMapping("/patients/{id}")
    public Patient replaceEmployee(@RequestBody Patient newPatient, @PathVariable Long id) {
        if (repository.findAll().contains(newPatient))
            throw new DuplicatedPatientException();
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

    @CrossOrigin
    @DeleteMapping("/patients/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
