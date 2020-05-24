package org.bmsdaschool.registration.registrationcentral.person.parent;

import org.bmsdaschool.registration.registrationcentral.building.Address;
import org.bmsdaschool.registration.registrationcentral.building.Church;
import org.bmsdaschool.registration.registrationcentral.person.EducationLevel;
import org.bmsdaschool.registration.registrationcentral.person.Child;
import org.bmsdaschool.registration.registrationcentral.person.Person;
import org.bmsdaschool.registration.registrationcentral.person.student.Student;

import javax.validation.constraints.NotNull;
import java.text.ParseException;

public class Parent extends Person {
    @NotNull
    private String email;

    @NotNull
    private Address homeAddress;

    private String employerName;
    private String occupation;

    @NotNull
    private String homeTelephoneNumber;

    @NotNull
    private String mobileTelephoneNumber;

    private String workTelephoneNumber;

    @NotNull
    private String ssn;

    private MaritalStatus maritalStatus;

    private Church churchAffiliation;

    @NotNull
    private boolean americanCitizen;

    @NotNull
    private String citizenship;

    private Child[] children;

    private Student[] students;

    @NotNull
    private String relationship;

    private String motives;

    public Parent(String firstName, String lastName, String middleName, String dateOfBirth, EducationLevel educationLevel) throws ParseException {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHomeTelephoneNumber() {
        return homeTelephoneNumber;
    }

    public void setHomeTelephoneNumber(String homeTelephoneNumber) {
        this.homeTelephoneNumber = homeTelephoneNumber;
    }

    public String getWorkTelephoneNumber() {
        return workTelephoneNumber;
    }

    public void setWorkTelephoneNumber(String workTelephoneNumber) {
        this.workTelephoneNumber = workTelephoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Church getChurchAffiliation() {
        return churchAffiliation;
    }

    public void setChurchAffiliation(Church churchAffiliation) {
        this.churchAffiliation = churchAffiliation;
    }

    public boolean isAmericanCitizen() {
        return americanCitizen;
    }

    public void setAmericanCitizen(boolean americanCitizen) {
        this.americanCitizen = americanCitizen;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Child[] getChildren() {
        return children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getMobileTelephoneNumber() {
        return mobileTelephoneNumber;
    }

    public void setMobileTelephoneNumber(String mobileTelephoneNumber) {
        this.mobileTelephoneNumber = mobileTelephoneNumber;
    }

    public String getMotives() {
        return motives;
    }

    public void setMotives(String motives) {
        this.motives = motives;
    }
}

enum MaritalStatus {
    SINGLE, MARRIED, REMARRIED, DIVORCED, SEPARATED, WIDOWER
}