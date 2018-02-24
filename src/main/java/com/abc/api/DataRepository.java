package com.abc.api;

import com.abc.api.types.*;
import com.abc.api.types.Scanner;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DataRepository {

    private Optional<Map<String, Flight>> flights;
    private Map<String, Boarding> boardings;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");


    public DataRepository() {
        this.flights = Optional.of( Stream.of(getFlight("10000","0450"),
                getFlight("10001","0451"),
                getFlight("10002","0452"),
                getFlight("10003","0453")).collect(Collectors.toMap(Flight::getId, Function.identity())));

        this.boardings = new HashMap<>();
    }

    private List<Seat> getSeats() {
        Seat aSeat = new Seat("A","Y", "Tom1", "Chen", "","Y","",false, "AKL","Checked","Boarded");
        Seat bSeat = new Seat("B","Y", "Tom2", "Chen", "","Y","",false, "AKL","Checked","Boarded");
        Seat cSeat = new Seat("C","Y", "Tom3", "Chen", "","Y","",false, "AKL","Checked","Boarded");
        Seat dSeat = new Seat("D","Y", "Tom4", "Chen", "","Y","",false, "AKL","Checked","Boarded");
        Seat eSeat = new Seat("E","Y", "Tom5", "Chen", "","Y","",false, "AKL","Checked","Boarded");
        Seat fSeat = new Seat("F","Y", "Tom6", "Chen", "","Y","",false, "AKL","Checked","Boarded");
        return Arrays.asList(aSeat, bSeat, cSeat, dSeat, eSeat, fSeat);
    }


    private Row getRow() {
        return new Row(getSeats());
    }

    private SeatMap getSeatMap() {
        return new SeatMap("0450", "Testing Flight with fake data.", "NZ","Advanced equipment.",
                Arrays.asList(getRow(), getRow(), getRow(), getRow(), getRow(), getRow(), getRow(), getRow(), getRow(), getRow()));
    }

    private Flight getFlight(String id, String flightNumber) {
        return new Flight(id,"Gates","30022C/XF","NZ",
                flightNumber,"","G2","AKL","WLG",
                "", FlightStatus.FO,100,0,100,80,getSeatMap());
    }


    public Map<String, Flight> getFlights() {
        return flights.get();
    }

    public void setFlights(Map<String, Flight> flights) {
        this.flights = Optional.of(flights);
    }

    public Flight openFlight(String agentSineCode, String flightNumber, String departureAirport) {
        Flight flight = new Flight(UUID.randomUUID().toString(),"Gates",agentSineCode,"NZ",
                flightNumber,"","G2",departureAirport,"WLG",
                "", FlightStatus.FO,100,0,100,80,getSeatMap());

        this.flights.orElseGet(this::getFlights).put(flight.getId(), flight);
        return flight;
    }

    public Flight closeFlight(String agentSineCode, String flightNumber, String departureAirport) {
        return this.flights.get().values().stream().filter(flight-> flight.getAgentSineCode().equals(agentSineCode) && flight.getFlightNumber().equals(flightNumber) && flight.getDepartureAirport().equals(flightNumber))
                .findFirst().orElse(null);
    }


    public Boarding getBoarding() {
        return new Boarding(UUID.randomUUID().toString(), BoardingStatus.BOARDED, BoardingSubStatus.ACK,"30033S/TT", getScanner(), "Gates", getFlight("20001","777"),
                "XXX-XXX","XXX","","AQWERT",
                "","",false,false,false, "Yes",
                new Seat("A","Y", "Tom1", "Chen", "","Y","",false, "AKL","Checked","Boarded"),
                "","Baarded",
                BoardType.MPASS,"",simpleDateFormat.format(new Date()),"","","","C","09809",
        "LAX","Y",true,"1",true,false,false,
                "","","ABCED8","",false,false, false,
                "","G02");
    }
    public Boarding getBoarding(String flightNumber) {
        return new Boarding(UUID.randomUUID().toString(), BoardingStatus.BOARDED, BoardingSubStatus.ACK,"30033S/TT", getScanner(), "Gates", getFlight("20001",flightNumber),
                "XXX-XXX","XXX","","AQWERT",
                "","",false,false,false, "Yes",
                new Seat("A","Y", "Tom1", "Chen", "","Y","",false, "AKL","Checked","Boarded"),
                "","Baarded",
                BoardType.MPASS,"",simpleDateFormat.format(new Date()),"","","","C","09809",
                "LAX","Y",true,"1",true,false,false,
                "","","ABCED8","",false,false, false,
                "","G02");
    }

    public Boarding getBoardingwithScanner(String scanner) {
        return new Boarding(UUID.randomUUID().toString(), BoardingStatus.BOARDED, BoardingSubStatus.ACK,"30033S/TT", getScanner(scanner), "Gates", getFlight("20001","777"),
                "XXX-XXX","XXX","","AQWERT",
                "","",false,false,false, "Yes",
                new Seat("A","Y", "Tom1", "Chen", "","Y","",false, "AKL","Checked","Boarded"),
                "","Baarded",
                BoardType.MPASS,"",simpleDateFormat.format(new Date()),"","","","C","09809",
                "LAX","Y",true,"1",true,false,false,
                "","","ABCED8","",false,false, false,
                "","G02");
    }

    public Boarding getBoarding(String firstName, String lastName, String flightNumber) {
        return new Boarding(UUID.randomUUID().toString(), BoardingStatus.BOARDED, BoardingSubStatus.ACK,"30033S/TT", getScanner(), "Gates", getFlight("20001",flightNumber),
                lastName, firstName,"","AQWERT",
                "","",false,false,false, "Yes",
                new Seat("A","Y", "Tom1", "Chen", "","Y","",false, "AKL","Checked","Boarded"),
                "","Baarded",
                BoardType.MPASS,"",simpleDateFormat.format(new Date()),"","","","C","09809",
                "LAX","Y",true,"1",true,false,false,
                "","","ABCED8","",false,false, false,
                "","G02");
    }


    private Scanner getScanner() {
        return new Scanner("HUB-TEST-001","10.0.0.1","");
    }

    private Scanner getScanner(String scanner) {
        return new Scanner(scanner,"10.0.0.1","");
    }

    public Map<String, Boarding> getBoardings() {
        return boardings;
    }

    public void addBoarding(Boarding boarding) {
        this.boardings.put(boarding.getId(),boarding);
    }
}
