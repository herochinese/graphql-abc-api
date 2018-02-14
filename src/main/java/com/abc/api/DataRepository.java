package com.abc.api;

import com.abc.api.types.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class DataRepository {

    private Map<String, Flight> flights;


    public DataRepository() {
        this.flights = Collections.unmodifiableMap(Stream.of(getFlight("10000","0450"),
                getFlight("10001","0451"),
                getFlight("10002","0452"),
                getFlight("10003","0453")).collect(Collectors.toMap(Flight::getId, Function.identity())));
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
        return flights;
    }

    public void setFlights(Map<String, Flight> flights) {
        this.flights = flights;
    }
}
