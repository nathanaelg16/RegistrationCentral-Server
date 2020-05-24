package org.bmsdaschool.registration.registrationcentral;

import org.bmsdaschool.registration.registrationcentral.person.parent.Parent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class RegistrationService {
    private ArrayList<Parent> parents;

    public void addParents(Parent[] parents) {
        Collections.addAll(this.parents, parents);
    }
}
