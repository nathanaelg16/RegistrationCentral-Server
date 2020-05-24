package org.bmsdaschool.registration.registrationcentral.person;

public class EducationLevel {
    private Level level;
    private int numYearsAttended;

    public EducationLevel(Level level, int numYearsAttended) {
        this.level = level;
        this.numYearsAttended = numYearsAttended;
    }

    public EducationLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getNumYearsAttended() {
        return numYearsAttended;
    }

    public void setNumYearsAttended(int numYearsAttended) {
        this.numYearsAttended = numYearsAttended;
    }

    public enum Level {
        TK,
        PK,
        K,
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH,
        SIXTH,
        SEVENTH,
        EIGHTH,
        HIGH_SCHOOL,
        COLLEGE,
        GRADUATE;
    }
}