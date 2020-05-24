package org.bmsdaschool.registration.registrationcentral;

import org.bmsdaschool.registration.registrationcentral.controllers.RegistrationCentral;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RegistrationCentral.class);
    }

}
