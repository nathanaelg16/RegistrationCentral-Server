package org.bmsdaschool.registration.registrationcentral.person.student;

import java.util.Date;

public class StudentDetails {
    private LivesWith livingWith;
    private boolean baptized;
    private Date baptismalDate;

    private StudentDetails(LivesWith livesWith, boolean baptized, Date baptismalDate) {
        this.livingWith = livesWith;
        this.baptized = baptized;
        this.baptismalDate = baptismalDate;
    }

    public static StudentDetails baptized(LivesWith livesWith, Date baptismalDate) {
        return new StudentDetails(livesWith, true, baptismalDate);
    }

    public static StudentDetails notBaptized(LivesWith livesWith) {
        return new StudentDetails(livesWith, false, null);
    }

    public LivesWith getLivingWith() {
        return livingWith;
    }

    public void setLivingWith(LivesWith livingWith) {
        this.livingWith = livingWith;
    }

    public boolean isBaptized() {
        return baptized;
    }

    public void setBaptized(boolean baptized) {
        this.baptized = baptized;
    }

    public Date getBaptismalDate() {
        return baptismalDate;
    }

    public void setBaptismalDate(Date baptismalDate) {
        this.baptismalDate = baptismalDate;
    }

    enum LivesWith {
        BOTH_PARENTS, MOTHER_ONLY, FATHER_ONLY, OTHER;
    }
}
