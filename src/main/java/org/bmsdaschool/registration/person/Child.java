package org.bmsdaschool.registration.person;

import org.bmsdaschool.registration.building.school.School;
import org.bmsdaschool.registration.person.student.AttendanceDetails;

import java.text.ParseException;
import java.util.HashMap;

public class Child extends Person {
    private HashMap<School, AttendanceDetails> schoolsAttended;

    public Child(String firstName, String lastName, String middleName, String dateOfBirth, EducationLevel educationLevel) throws ParseException {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
    }

    public Child(String firstName, String lastName, String middleName, String dateOfBirth, EducationLevel educationLevel, HashMap<School, AttendanceDetails> schoolsAttended) throws ParseException {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
        this.schoolsAttended = schoolsAttended;
    }
}
