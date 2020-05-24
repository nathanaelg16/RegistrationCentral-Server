package org.bmsdaschool.registration.registrationcentral.models;

import org.bmsdaschool.registration.registrationcentral.Log;

import java.io.*;
import java.util.*;

public class Address {
    private static ArrayList<String> states;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int zipCode;

    public Address(String addressLine1, String addressLine2, String city, String state, int zipCode) throws InvalidAddressException {
        if (Address.states == null) loadStates();

        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.setState(state);
        this.setZipCode(zipCode);
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) throws InvalidAddressException {
        if (state.length() != 2) throw new InvalidAddressException("Expected abbreviated state name");
        if (Address.states.contains(state)) {
            this.state = state;
        } else throw new InvalidAddressException("Invalid state.");
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) throws InvalidAddressException {
        if (String.valueOf(zipCode).length() != 5) throw new InvalidAddressException("Zip code is invalid.");
        this.zipCode = zipCode;
    }

    private static void loadStates() {
        InputStream is = Objects.requireNonNull(ClassLoader.getSystemResourceAsStream("static/bundles/states"));
        Scanner scanner = new Scanner(is);
        String line = scanner.nextLine();
        String[] states = line.split(",");
        for (String state: states) {
            Address.states.add(state.trim());
        }

        try {
            scanner.close();
            is.close();
        } catch (IOException e) {
            Log.log(e);
        }
    }
}

class InvalidAddressException extends Exception {
    public InvalidAddressException() {
        super();
    }

    public InvalidAddressException(String message) {
        super(message);
    }
}