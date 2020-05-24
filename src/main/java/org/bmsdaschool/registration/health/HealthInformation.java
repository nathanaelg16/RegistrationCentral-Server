package org.bmsdaschool.registration.health;

import org.bmsdaschool.registration.building.HealthClinic;

public class HealthInformation {
    private HealthClinic healthClinic;
    private String physicianName;
    private Insurance insurance;
    private boolean coveredByInsurance;

    public HealthInformation(HealthClinic healthClinic, String physicianName, Insurance insurance, boolean coveredByInsurance) {
        this.healthClinic = healthClinic;
        this.physicianName = physicianName;
        this.insurance = insurance;
        this.coveredByInsurance = coveredByInsurance;
    }

    public HealthInformation(boolean coveredByInsurance) {
        this.coveredByInsurance = coveredByInsurance;
    }

    public HealthInformation(HealthClinic healthClinic, String physicianName) {
        this.healthClinic = healthClinic;
        this.physicianName = physicianName;
    }

    public HealthClinic getHealthClinic() {
        return healthClinic;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public boolean isCoveredByInsurance() {
        return coveredByInsurance;
    }

    public void setHealthClinic(HealthClinic healthClinic) {
        this.healthClinic = healthClinic;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setCoveredByInsurance(boolean coveredByInsurance) {
        this.coveredByInsurance = coveredByInsurance;
    }
}
