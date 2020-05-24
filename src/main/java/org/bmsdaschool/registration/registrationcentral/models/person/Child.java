package org.bmsdaschool.registration.registrationcentral.models.person;

import org.bmsdaschool.registration.registrationcentral.models.building.school.AttendanceDetails;
import org.bmsdaschool.registration.registrationcentral.models.building.school.School;

import java.util.Date;
import java.util.HashMap;

public class Child extends Person {
    private HashMap<School, AttendanceDetails> schoolsAttended;

    public Child(String firstName, String lastName, String middleName, Date dateOfBirth, EducationLevel educationLevel) {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
    }
}
