package org.bmsdaschool.registration;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
//import org.bmsdaschool.registration.registrationcentral.Registration;
import org.bmsdaschool.registration.building.Address;
import org.bmsdaschool.registration.building.Church;
import org.bmsdaschool.registration.exception.InvalidAddressException;
import org.bmsdaschool.registration.person.EducationLevel;
import org.bmsdaschool.registration.person.parent.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.text.ParseException;
import java.util.Arrays;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

@SpringBootApplication
@RestController
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class RegistrationCentral {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationCentral.class, args);
    }

    @Autowired
    RegistrationService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/")
    public ResponseEntity hello(@RequestBody @Valid Parent[] parents) {
        System.out.println(Arrays.toString(parents));
        service.addParents(parents);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/")
    public Parent getParent() throws ParseException, InvalidAddressException {
        Parent p = new Parent("Nathanael", "", "Gutierrez", "1998-05-30", new EducationLevel(EducationLevel.Level.COLLEGE, 4));
        p.setEmail("nathanaelg16@gmail.com");
        p.setHomeAddress(new Address("1401 Jesup Ave", "APT 5G", "Bronx", "NY", 10452));
        p.setEmployerName("BMSDA");
        p.setOccupation("Teacher");
        p.setHomeTelephoneNumber("6466857820");
        p.setMobileTelephoneNumber("6466857820");
        p.setWorkTelephoneNumber("6466857820");
        p.setRelationship("Uncle");
        //Church c = new Church("MyGeneration Church", "Pr. Duddley Francois", new Address("111 W 111th St", null, "New York", "NY", 10025), "7185881111", "Marbin Bascombe", "SDA", "Greater New York Conference");
        //p.setChurchAffiliation(c);
        p.setAmericanCitizen(true);
        p.setCitizenship("USA");
        return p;
    }
}
