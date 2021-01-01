package com.thiess.cgm.patientDataCrudApplication;

import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import com.thiess.cgm.patientDataCrudApplication.repository.PatientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PatientControllerUnitTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PatientRepository patientRepository;

    /**
     * Tests if API returns all patients correctly.
     */
    @Test
    public void saveAndRetrievePatient() throws Exception{
        Patient patient = new Patient("Henrik", "Thiess", "Saalburgweg 2", "61169 Friedberg");
        List<Patient> allPatients = Collections.singletonList(patient);
        given(patientRepository.findAll()).willReturn(allPatients);

        mvc.perform(get("/api/v1/patients"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].firstName").value(patient.getFirstName()));

    }

}
