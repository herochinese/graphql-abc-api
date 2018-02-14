package com.abc.api.types;

public class Seat {
    private String column;
    private String occupation;
    private String firstName;
    private String lastName;
    private String loyaltyTier;
    private String specialHandling;
    private String unfitted;
    private boolean type;
    private String lastKnownLocation;
    private String checkInStatus;
    private String boardingInfo;


    public Seat(String column, String occupation, String firstName, String lastName, String loyaltyTier, String specialHandling, String unfitted, boolean type, String lastKnownLocation, String checkInStatus, String boardingInfo) {
        this.column = column;
        this.occupation = occupation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyTier = loyaltyTier;
        this.specialHandling = specialHandling;
        this.unfitted = unfitted;
        this.type = type;
        this.lastKnownLocation = lastKnownLocation;
        this.checkInStatus = checkInStatus;
        this.boardingInfo = boardingInfo;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoyaltyTier() {
        return loyaltyTier;
    }

    public void setLoyaltyTier(String loyaltyTier) {
        this.loyaltyTier = loyaltyTier;
    }

    public String getSpecialHandling() {
        return specialHandling;
    }

    public void setSpecialHandling(String specialHandling) {
        this.specialHandling = specialHandling;
    }

    public String getUnfitted() {
        return unfitted;
    }

    public void setUnfitted(String unfitted) {
        this.unfitted = unfitted;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(String lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getCheckInStatus() {
        return checkInStatus;
    }

    public void setCheckInStatus(String checkInStatus) {
        this.checkInStatus = checkInStatus;
    }

    public String getBoardingInfo() {
        return boardingInfo;
    }

    public void setBoardingInfo(String boardingInfo) {
        this.boardingInfo = boardingInfo;
    }
}
