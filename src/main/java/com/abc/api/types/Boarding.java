package com.abc.api.types;

public class Boarding {

    String id;
    BoardingStatus state;
    BoardingSubStatus subState;

    String agentSineCode;
    Scanner scanner;
    String jacSessionID;

    Flight flight;

    String lastName;
    String firstName;
    String type;
    String pnr;
    String paxRef;
    String paxNumber;
    boolean child;
    boolean infant;
    boolean withInfant;
    String withBoardingPass;

    Seat seat;

    String groupNumber;
    String boardingInfo;
    BoardType boardType;
    String scanNumber;
    String boardTime;
    String info;
    String csn;
    String customerGUID;
    String loyaltyTier;
    String frequentFlyerProgram;
    String frequentFlyerNumber;
    String inbound;
    boolean ep1;
    String numberOfBags;
    boolean checkedIn;
    boolean orginalCheckedIn;
    boolean webCheck;
    String checkInStatus;
    String specialHandling;
    String lastKnownLocation;
    String bagTagNumbers;
    boolean isTranship;
    boolean isTransit;
    boolean exitRow;
    String acknowledgeDateTime;
    String gate;

    public Boarding(String id, BoardingStatus state, BoardingSubStatus subState, String agentSineCode, Scanner scanner, String jacSessionID, Flight flight, String lastName, String firstName, String type, String pnr, String paxRef, String paxNumber, boolean child, boolean infant, boolean withInfant, String withBoardingPass, Seat seat, String groupNumber, String boardingInfo, BoardType boardType, String scanNumber, String boardTime, String info, String csn, String customerGUID, String loyaltyTier, String frequentFlyerProgram, String frequentFlyerNumber, String inbound, boolean ep1, String numberOfBags, boolean checkedIn, boolean orginalCheckedIn, boolean webCheck, String checkInStatus, String specialHandling, String lastKnownLocation, String bagTagNumbers, boolean isTranship, boolean isTransit, boolean exitRow, String acknowledgeDateTime, String gate) {
        this.id = id;
        this.state = state;
        this.subState = subState;
        this.agentSineCode = agentSineCode;
        this.scanner = scanner;
        this.jacSessionID = jacSessionID;
        this.flight = flight;
        this.lastName = lastName;
        this.firstName = firstName;
        this.type = type;
        this.pnr = pnr;
        this.paxRef = paxRef;
        this.paxNumber = paxNumber;
        this.child = child;
        this.infant = infant;
        this.withInfant = withInfant;
        this.withBoardingPass = withBoardingPass;
        this.seat = seat;
        this.groupNumber = groupNumber;
        this.boardingInfo = boardingInfo;
        this.boardType = boardType;
        this.scanNumber = scanNumber;
        this.boardTime = boardTime;
        this.info = info;
        this.csn = csn;
        this.customerGUID = customerGUID;
        this.loyaltyTier = loyaltyTier;
        this.frequentFlyerProgram = frequentFlyerProgram;
        this.frequentFlyerNumber = frequentFlyerNumber;
        this.inbound = inbound;
        this.ep1 = ep1;
        this.numberOfBags = numberOfBags;
        this.checkedIn = checkedIn;
        this.orginalCheckedIn = orginalCheckedIn;
        this.webCheck = webCheck;
        this.checkInStatus = checkInStatus;
        this.specialHandling = specialHandling;
        this.lastKnownLocation = lastKnownLocation;
        this.bagTagNumbers = bagTagNumbers;
        this.isTranship = isTranship;
        this.isTransit = isTransit;
        this.exitRow = exitRow;
        this.acknowledgeDateTime = acknowledgeDateTime;
        this.gate = gate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BoardingStatus getState() {
        return state;
    }

    public void setState(BoardingStatus state) {
        this.state = state;
    }

    public BoardingSubStatus getSubState() {
        return subState;
    }

    public void setSubState(BoardingSubStatus subState) {
        this.subState = subState;
    }

    public String getAgentSineCode() {
        return agentSineCode;
    }

    public void setAgentSineCode(String agentSineCode) {
        this.agentSineCode = agentSineCode;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getJacSessionID() {
        return jacSessionID;
    }

    public void setJacSessionID(String jacSessionID) {
        this.jacSessionID = jacSessionID;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getPaxRef() {
        return paxRef;
    }

    public void setPaxRef(String paxRef) {
        this.paxRef = paxRef;
    }

    public String getPaxNumber() {
        return paxNumber;
    }

    public void setPaxNumber(String paxNumber) {
        this.paxNumber = paxNumber;
    }

    public boolean isChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public boolean isInfant() {
        return infant;
    }

    public void setInfant(boolean infant) {
        this.infant = infant;
    }

    public boolean isWithInfant() {
        return withInfant;
    }

    public void setWithInfant(boolean withInfant) {
        this.withInfant = withInfant;
    }

    public String getWithBoardingPass() {
        return withBoardingPass;
    }

    public void setWithBoardingPass(String withBoardingPass) {
        this.withBoardingPass = withBoardingPass;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getBoardingInfo() {
        return boardingInfo;
    }

    public void setBoardingInfo(String boardingInfo) {
        this.boardingInfo = boardingInfo;
    }

    public BoardType getBoardType() {
        return boardType;
    }

    public void setBoardType(BoardType boardType) {
        this.boardType = boardType;
    }

    public String getScanNumber() {
        return scanNumber;
    }

    public void setScanNumber(String scanNumber) {
        this.scanNumber = scanNumber;
    }

    public String getBoardTime() {
        return boardTime;
    }

    public void setBoardTime(String boardTime) {
        this.boardTime = boardTime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCsn() {
        return csn;
    }

    public void setCsn(String csn) {
        this.csn = csn;
    }

    public String getCustomerGUID() {
        return customerGUID;
    }

    public void setCustomerGUID(String customerGUID) {
        this.customerGUID = customerGUID;
    }

    public String getLoyaltyTier() {
        return loyaltyTier;
    }

    public void setLoyaltyTier(String loyaltyTier) {
        this.loyaltyTier = loyaltyTier;
    }

    public String getFrequentFlyerProgram() {
        return frequentFlyerProgram;
    }

    public void setFrequentFlyerProgram(String frequentFlyerProgram) {
        this.frequentFlyerProgram = frequentFlyerProgram;
    }

    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    public void setFrequentFlyerNumber(String frequentFlyerNumber) {
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public String getInbound() {
        return inbound;
    }

    public void setInbound(String inbound) {
        this.inbound = inbound;
    }

    public boolean isEp1() {
        return ep1;
    }

    public void setEp1(boolean ep1) {
        this.ep1 = ep1;
    }

    public String getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(String numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public boolean isOrginalCheckedIn() {
        return orginalCheckedIn;
    }

    public void setOrginalCheckedIn(boolean orginalCheckedIn) {
        this.orginalCheckedIn = orginalCheckedIn;
    }

    public boolean isWebCheck() {
        return webCheck;
    }

    public void setWebCheck(boolean webCheck) {
        this.webCheck = webCheck;
    }

    public String getCheckInStatus() {
        return checkInStatus;
    }

    public void setCheckInStatus(String checkInStatus) {
        this.checkInStatus = checkInStatus;
    }

    public String getSpecialHandling() {
        return specialHandling;
    }

    public void setSpecialHandling(String specialHandling) {
        this.specialHandling = specialHandling;
    }

    public String getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(String lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getBagTagNumbers() {
        return bagTagNumbers;
    }

    public void setBagTagNumbers(String bagTagNumbers) {
        this.bagTagNumbers = bagTagNumbers;
    }

    public boolean isTranship() {
        return isTranship;
    }

    public void setTranship(boolean tranship) {
        isTranship = tranship;
    }

    public boolean isTransit() {
        return isTransit;
    }

    public void setTransit(boolean transit) {
        isTransit = transit;
    }

    public boolean isExitRow() {
        return exitRow;
    }

    public void setExitRow(boolean exitRow) {
        this.exitRow = exitRow;
    }

    public String getAcknowledgeDateTime() {
        return acknowledgeDateTime;
    }

    public void setAcknowledgeDateTime(String acknowledgeDateTime) {
        this.acknowledgeDateTime = acknowledgeDateTime;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }
}
