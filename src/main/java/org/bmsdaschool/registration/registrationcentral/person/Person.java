package org.bmsdaschool.registration.registrationcentral.person;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String middleName;

    @NotNull
    private Date dateOfBirth;

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    private EducationLevel educationLevel;

    public Person(String firstName, String lastName, String middleName, String dateOfBirth, EducationLevel educationLevel) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        setDateOfBirth(dateOfBirth);
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

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.dateOfBirth = format.parse(dateOfBirth);
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                '}';
    }
}
