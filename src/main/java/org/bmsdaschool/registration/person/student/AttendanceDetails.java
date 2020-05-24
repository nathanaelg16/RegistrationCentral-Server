package org.bmsdaschool.registration.person.student;


import org.bmsdaschool.registration.person.EducationLevel;

public class AttendanceDetails {
    private EducationLevel[] gradesCompleted;
    private String yearsAttended;

    public AttendanceDetails(EducationLevel[] gradesCompleted, String yearsAttended) {
        this.gradesCompleted = gradesCompleted;
        this.yearsAttended = yearsAttended;
    }

    public EducationLevel[] getGradesCompleted() {
        return gradesCompleted;
    }

    public void setGradesCompleted(EducationLevel[] gradesCompleted) {
        this.gradesCompleted = gradesCompleted;
    }

    public String getYearsAttended() {
        return yearsAttended;
    }

    public void setYearsAttended(String yearsAttended) {
        this.yearsAttended = yearsAttended;
    }
}
