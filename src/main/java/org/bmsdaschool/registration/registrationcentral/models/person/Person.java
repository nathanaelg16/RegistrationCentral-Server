package org.bmsdaschool.registration.registrationcentral.models.person;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private EducationLevel educationLevel;

    public Person(String firstName, String lastName, String middleName, Date dateOfBirth, EducationLevel educationLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.educationLevel = educationLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                Objects.equals(middleName, person.middleName) &&
                dateOfBirth.equals(person.dateOfBirth) &&
                educationLevel.equals(person.educationLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, dateOfBirth, educationLevel);
    }
}
