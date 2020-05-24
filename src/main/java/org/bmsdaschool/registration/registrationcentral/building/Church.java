package org.bmsdaschool.registration.registrationcentral.building;

import java.util.Objects;

public class Church extends Building {
    private String pastor;
    private String sabbathSchoolTeacher;
    private String denomination;
    private String conference;

    public Church(String name, String pastor, Address address, String telephoneNumber, String sabbathSchoolTeacher, String denomination, String conference) {
        super(name, address, telephoneNumber);
        this.pastor = pastor;
        this.sabbathSchoolTeacher = sabbathSchoolTeacher;
        this.denomination = denomination;
        this.conference = conference;
    }

    public Church(String name, Address address, String telephoneNumber, String pastor, String denomination) {
        super(name, address, telephoneNumber);
        this.pastor = pastor;
        this.denomination = denomination;
    }

    public String getPastor() {
        return pastor;
    }

    public void setPastor(String pastor) {
        this.pastor = pastor;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getSabbathSchoolTeacher() {
        return sabbathSchoolTeacher;
    }

    public void setSabbathSchoolTeacher(String sabbathSchoolTeacher) {
        this.sabbathSchoolTeacher = sabbathSchoolTeacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Church church = (Church) o;
        return pastor.equals(church.pastor) &&
                denomination.equals(church.denomination) &&
                Objects.equals(conference, church.conference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pastor, denomination, conference);
    }
}
