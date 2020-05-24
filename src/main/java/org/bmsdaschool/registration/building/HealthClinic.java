package org.bmsdaschool.registration.building;

import java.util.Objects;

public class HealthClinic {
    private Address address;
    private String name;
    private String phoneNumber;

    public HealthClinic(Address address, String name, String phoneNumber) {
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthClinic that = (HealthClinic) o;
        return address.equals(that.address) &&
                name.equals(that.name) &&
                phoneNumber.equals(that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name, phoneNumber);
    }
}
