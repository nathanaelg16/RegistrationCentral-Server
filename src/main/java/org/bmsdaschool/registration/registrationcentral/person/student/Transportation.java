package org.bmsdaschool.registration.registrationcentral.person.student;

public class Transportation {
    private Borough borough;
    private TransportationType transportationType;
    private String routeNumber;
    private String stopLocation;

    public Transportation(Borough borough, TransportationType transportationType, String routeNumber, String stopLocation) {
        this.borough = borough;
        this.transportationType = transportationType;
        this.routeNumber = routeNumber;
        this.stopLocation = stopLocation;
    }

    public Borough getBorough() {
        return borough;
    }

    public void setBorough(Borough borough) {
        this.borough = borough;
    }

    public TransportationType getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(TransportationType transportationType) {
        this.transportationType = transportationType;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getStopLocation() {
        return stopLocation;
    }

    public void setStopLocation(String stopLocation) {
        this.stopLocation = stopLocation;
    }
}

enum Borough {
    BRONX,
    BROOKLYN,
    MANHATTAN,
    QUEENS,
    STATEN_ISLAND;
}

enum TransportationType {
    YELLOW_BUS, NYCT;
}