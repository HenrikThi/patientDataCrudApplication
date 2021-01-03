package com.thiess.cgm.patientDataCrudApplication;

import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import com.thiess.cgm.patientDataCrudApplication.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Random;

@Configuration
public class LoadDummyData {
    private static final Logger log = LoggerFactory.getLogger(LoadDummyData.class);

    private final String[] NAMES = {"Marian Fogleman", "Darcy Wisecarver", "Danae Solorzano", "Selena Mcbay", "Leopoldo Hudkins", "Su Kleiner", "Brunilda Harty", "Dion Blanck", "Missy Pritchett", "Reggie Blom", "Lavonia Hurd", "Danielle Peter", "Anissa Vieira", "Mayme Cappiello", "Zena Slama", "Brain Herrick", "Fredia Hollmann", "Susan Grunwald", "Naomi Loiselle", "Arlie Dear", "Marline Medel", "Lizzette Borgia", "Traci Stano", "Douglas Linares", "Pierre Jeffries", "Tonya Vince", "Matilda Andrus", "Ladonna Inge", "Sonya Luedtke", "Cinderella Peredo"};
    private final String[] STREETS = {"Kaiserstraße", "Lindenstraße", "Taunusstraße", "Mainzer-Tor-Anlage", "Birkenstraße"};

    @Bean
    CommandLineRunner initDatabase(PatientRepository repository) {

        return args -> {
            Arrays.stream(NAMES).forEach(name -> {
                String[] firstAndLastname = name.split(" ");
                log.info("Preloading " + repository.save(new Patient(firstAndLastname[0], firstAndLastname[1], STREETS[new Random().nextInt(STREETS.length)] + " " + new Random().nextInt(20) + 1, "61169 Friedberg")));
            });
        };
    }

}
