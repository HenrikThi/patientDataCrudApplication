package com.thiess.cgm.patientDataCrudApplication;

import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import com.thiess.cgm.patientDataCrudApplication.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDummyData {
    private static final Logger log = LoggerFactory.getLogger(LoadDummyData.class);

    @Bean
    CommandLineRunner initDatabase(PatientRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Patient("Henrik", "Thiess", "Saalburgweg 2", "61169 Friedberg")));
            log.info("Preloading " + repository.save(new Patient("Otto", "Brune", "Ginsterweg 2", "61169 Friedberg")));
        };
    }

}
