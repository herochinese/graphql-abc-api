package com.abc.api.types;

public class Flight {

    private String id;
    private String jacSessionID;
    private String agentSineCode;

    private String airlineOperatingCode;
    private String flightNumber;
    private String gate;
    private String originalGate;
    private String departureAirport;
    private String arrivalAirport;
    private String bookingClassPref;
    private FlightStatus status;
    private int paxToBoard;
    private int paxBoarded;
    private int paxLeftToBoard;
    private int paxCheckedIn;
    private SeatMap seatMap;


    public Flight(String id, String jacSessionID, String agentSineCode, String airlineOperatingCode, String flightNumber, String gate, String originalGate, String departureAirport, String arrivalAirport, String bookingClassPref, FlightStatus status, int paxToBoard, int paxBoarded, int paxLeftToBoard, int paxCheckedIn, SeatMap seatMap) {
        this.id = id;
        this.jacSessionID = jacSessionID;
        this.agentSineCode = agentSineCode;
        this.airlineOperatingCode = airlineOperatingCode;
        this.flightNumber = flightNumber;
        this.gate = gate;
        this.originalGate = originalGate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.bookingClassPref = bookingClassPref;
        this.status = status;
        this.paxToBoard = paxToBoard;
        this.paxBoarded = paxBoarded;
        this.paxLeftToBoard = paxLeftToBoard;
        this.paxCheckedIn = paxCheckedIn;
        this.seatMap = seatMap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJacSessionID() {
        return jacSessionID;
    }

    public void setJacSessionID(String jacSessionID) {
        this.jacSessionID = jacSessionID;
    }

    public String getAgentSineCode() {
        return agentSineCode;
    }

    public void setAgentSineCode(String agentSineCode) {
        this.agentSineCode = agentSineCode;
    }

    public String getAirlineOperatingCode() {
        return airlineOperatingCode;
    }

    public void setAirlineOperatingCode(String airlineOperatingCode) {
        this.airlineOperatingCode = airlineOperatingCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getOriginalGate() {
        return originalGate;
    }

    public void setOriginalGate(String originalGate) {
        this.originalGate = originalGate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getBookingClassPref() {
        return bookingClassPref;
    }

    public void setBookingClassPref(String bookingClassPref) {
        this.bookingClassPref = bookingClassPref;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public int getPaxToBoard() {
        return paxToBoard;
    }

    public void setPaxToBoard(int paxToBoard) {
        this.paxToBoard = paxToBoard;
    }

    public int getPaxBoarded() {
        return paxBoarded;
    }

    public void setPaxBoarded(int paxBoarded) {
        this.paxBoarded = paxBoarded;
    }

    public int getPaxLeftToBoard() {
        return paxLeftToBoard;
    }

    public void setPaxLeftToBoard(int paxLeftToBoard) {
        this.paxLeftToBoard = paxLeftToBoard;
    }

    public int getPaxCheckedIn() {
        return paxCheckedIn;
    }

    public void setPaxCheckedIn(int paxCheckedIn) {
        this.paxCheckedIn = paxCheckedIn;
    }

    public SeatMap getSeatMap() {
        return seatMap;
    }

    public void setSeatMap(SeatMap seatMap) {
        this.seatMap = seatMap;
    }
}
