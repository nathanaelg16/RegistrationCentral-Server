package org.bmsdaschool.registration.registrationcentral.person.student;

import org.bmsdaschool.registration.registrationcentral.health.HealthInformation;
import org.bmsdaschool.registration.registrationcentral.person.Child;
import org.bmsdaschool.registration.registrationcentral.person.EducationLevel;
import org.bmsdaschool.registration.registrationcentral.person.parent.Parent;

import java.util.Date;
import java.util.Objects;

public class Student extends Child {
    private Parent[] parents;
    private EducationLevel applyingForGrade;
    private String startingDate;
    private String ssn;
    private String birthplace;
    private char gender;
    private Ethnicity ethnicity;
    private String language;
    private Transportation transportation;
    private StudentDetails studentDetails;
    private HealthInformation healthInformation;

    public Student(String firstName, String lastName, String middleName, Date dateOfBirth, Parent[] parents, EducationLevel currentGrade,
                   EducationLevel applyingForGrade, String startingDate, String ssn, String birthplace,
                   char gender, Ethnicity ethnicity, String language, Transportation transportation, StudentDetails studentDetails, HealthInformation healthInformation) {
        super(firstName, lastName, middleName, dateOfBirth, currentGrade);
        this.parents = parents;
        this.applyingForGrade = applyingForGrade;
        this.startingDate = startingDate;
        this.ssn = ssn;
        this.birthplace = birthplace;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.language = language;
        this.transportation = transportation;
        this.studentDetails = studentDetails;
        this.healthInformation = healthInformation;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public EducationLevel getCurrentGrade() {
        return getEducationLevel();
    }

    public void setCurrentGrade(EducationLevel currentGrade) {
        setEducationLevel(currentGrade);
    }

    public EducationLevel getApplyingForGrade() {
        return applyingForGrade;
    }

    public void setApplyingForGrade(EducationLevel applyingForGrade) {
        this.applyingForGrade = applyingForGrade;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Ethnicity getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    public HealthInformation getHealthInformation() {
        return healthInformation;
    }

    public void setHealthInformation(HealthInformation healthInformation) {
        this.healthInformation = healthInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return gender == student.gender &&
                applyingForGrade.equals(student.applyingForGrade) &&
                Objects.equals(ssn, student.ssn) &&
                birthplace.equals(student.birthplace) &&
                ethnicity == student.ethnicity &&
                language.equals(student.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), applyingForGrade, ssn, birthplace, gender, ethnicity, language);
    }
}

