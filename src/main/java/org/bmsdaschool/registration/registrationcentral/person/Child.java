package org.bmsdaschool.registration.registrationcentral.person;

import org.bmsdaschool.registration.registrationcentral.building.school.AttendanceDetails;
import org.bmsdaschool.registration.registrationcentral.building.school.School;

import java.util.Date;
import java.util.HashMap;

public class Child extends Person {
    private HashMap<School, AttendanceDetails> schoolsAttended;

    public Child(String firstName, String lastName, String middleName, Date dateOfBirth, EducationLevel educationLevel) {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
    }

    public Child(String firstName, String lastName, String middleName, Date dateOfBirth, EducationLevel educationLevel, HashMap<School, AttendanceDetails> schoolsAttended) {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
        this.schoolsAttended = schoolsAttended;
    }
}
