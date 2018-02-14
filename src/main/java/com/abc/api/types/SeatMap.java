package com.abc.api.types;

import java.util.List;

public class SeatMap {
    private String flightNumber;
    private String aircraftDescription;
    private String airlineOperatingCode;
    private String equipment;
    private List<Row> rowList;

    public SeatMap(String flightNumber, String aircraftDescription, String airlineOperatingCode, String equipment, List<Row> rowList) {
        this.flightNumber = flightNumber;
        this.aircraftDescription = aircraftDescription;
        this.airlineOperatingCode = airlineOperatingCode;
        this.equipment = equipment;
        this.rowList = rowList;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftDescription() {
        return aircraftDescription;
    }

    public void setAircraftDescription(String aircraftDescription) {
        this.aircraftDescription = aircraftDescription;
    }

    public String getAirlineOperatingCode() {
        return airlineOperatingCode;
    }

    public void setAirlineOperatingCode(String airlineOperatingCode) {
        this.airlineOperatingCode = airlineOperatingCode;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public List<Row> getRowList() {
        return rowList;
    }

    public void setRowList(List<Row> rowList) {
        this.rowList = rowList;
    }
}
