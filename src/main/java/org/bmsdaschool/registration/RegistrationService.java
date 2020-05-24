package org.bmsdaschool.registration;

import org.bmsdaschool.registration.person.parent.Parent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class RegistrationService {
    private ArrayList<Parent> parents = new ArrayList<>();

    public void addParents(Parent[] parents) {
        Collections.addAll(this.parents, parents);
    }

    public void addParents(Parent parent) {
        parents.add(parent);
    }
}
