package org.bmsdaschool.registration.registrationcentral.models.health;

import java.util.Objects;

public class Insurance {
    private String name;
    private String policy;
    private String group;
    private String nameOfParentOnInsurance;


    public Insurance(String name, String policy, String group, String nameOfParentOnInsurance) {
        this.name = name;
        this.policy = policy;
        this.group = group;
        this.nameOfParentOnInsurance = nameOfParentOnInsurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNameOfParentOnInsurance() {
        return nameOfParentOnInsurance;
    }

    public void setNameOfParentOnInsurance(String nameOfParentOnInsurance) {
        this.nameOfParentOnInsurance = nameOfParentOnInsurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return name.equals(insurance.name) &&
                policy.equals(insurance.policy) &&
                Objects.equals(group, insurance.group) &&
                Objects.equals(nameOfParentOnInsurance, insurance.nameOfParentOnInsurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, policy, group, nameOfParentOnInsurance);
    }
}
