package org.bmsdaschool.registration.building.school;

import org.bmsdaschool.registration.building.Address;
import org.bmsdaschool.registration.building.Building;

import java.util.Objects;

public class School extends Building {
    private String principal;

    public School(String name, Address address, String telephoneNumber, String principal) {
        super(name, address, telephoneNumber);
        this.principal = principal;
    }

    public School(String name, Address address, String principal) {
        super(name, address);
        this.principal = principal;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        School school = (School) o;
        return principal.equals(school.principal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), principal);
    }
}

