package org.bmsdaschool.registration.building;

import java.util.Objects;

public class Building {
    private String name;
    private Address address;
    private String telephoneNumber;

    public Building(String name, Address address, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public Building(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return address.equals(building.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
