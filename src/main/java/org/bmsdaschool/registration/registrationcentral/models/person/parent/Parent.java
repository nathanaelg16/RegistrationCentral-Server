package org.bmsdaschool.registration.registrationcentral.models.person.parent;

import org.bmsdaschool.registration.registrationcentral.models.Address;
import org.bmsdaschool.registration.registrationcentral.models.building.Church;
import org.bmsdaschool.registration.registrationcentral.models.person.EducationLevel;
import org.bmsdaschool.registration.registrationcentral.models.person.Child;
import org.bmsdaschool.registration.registrationcentral.models.person.Person;
import org.bmsdaschool.registration.registrationcentral.models.person.student.Student;

import java.util.Date;

public class Parent extends Person {
    private String email;
    private Address homeAddress;
    private String employerName;
    private String occupation;
    private String homeTelephoneNumber;
    private String workTelephoneNumber;
    private String ssn;
    private MaritalStatus maritalStatus;
    private Church churchAffiliation;
    private boolean americanCitizen;
    private String citizenship;
    private Child[] children;
    private Student[] students;
    private String relationship;

    public Parent(String firstName, String lastName, String middleName, Date dateOfBirth, String email, Address homeAddress,
                  String employerName, String occupation, String homeTelephoneNumber, String workTelephoneNumber,
                  String ssn, EducationLevel educationLevel, MaritalStatus maritalStatus, Church churchAffiliation,
                  boolean americanCitizen, String citizenship, Child[] children, Student[] students, String relationship) {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
        this.email = email;
        this.homeAddress = homeAddress;
        this.employerName = employerName;
        this.occupation = occupation;
        this.homeTelephoneNumber = homeTelephoneNumber;
        this.workTelephoneNumber = workTelephoneNumber;
        this.ssn = ssn;
        this.maritalStatus = maritalStatus;
        this.churchAffiliation = churchAffiliation;
        this.americanCitizen = americanCitizen;
        this.citizenship = citizenship;
        this.children = children;
        this.students = students;
        this.relationship = relationship;
    }

    public Parent(String firstName, String lastName, String middleName,
                  Date dateOfBirth, EducationLevel educationLevel, String email, Address homeAddress,
                  String employerName, String occupation, String homeTelephoneNumber,
                  String workTelephoneNumber, String relationship) {
        super(firstName, lastName, middleName, dateOfBirth, educationLevel);
        this.email = email;
        this.homeAddress = homeAddress;
        this.employerName = employerName;
        this.occupation = occupation;
        this.homeTelephoneNumber = homeTelephoneNumber;
        this.workTelephoneNumber = workTelephoneNumber;
        this.relationship = relationship;
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
}

enum MaritalStatus {
    SINGLE, MARRIED, REMARRIED, DIVORCED, SEPARATED, WIDOWER
}