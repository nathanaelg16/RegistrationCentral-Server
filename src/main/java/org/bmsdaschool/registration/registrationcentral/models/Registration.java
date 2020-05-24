package org.bmsdaschool.registration.registrationcentral.models;

import org.bmsdaschool.registration.registrationcentral.models.person.parent.Parent;
import org.bmsdaschool.registration.registrationcentral.models.person.student.Student;

public class Registration {
    private Parent[] parents;
    private Student[] students;

    public Registration(Parent[] parents, Student[] students) {
        this.parents = parents;
        this.students = students;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
