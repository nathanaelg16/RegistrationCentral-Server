package org.bmsdaschool.registration.registrationcentral;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
//import org.bmsdaschool.registration.registrationcentral.Registration;
import org.bmsdaschool.registration.registrationcentral.person.parent.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public ResponseEntity hello(@RequestBody @Valid Parent[] parent) {
        service.addParents(parent);
        return ResponseEntity.accepted().build();
    }
}
