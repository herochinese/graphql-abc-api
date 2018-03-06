package com.abc.api.resolvers;

import com.abc.api.DataRepository;
import com.abc.api.types.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightOperation {

    private DataRepository dataRepository;

    @Autowired
    public FlightOperation(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public Flight open(String agentSineCode, String flightNumber, String departureAirport) {
        return dataRepository.openFlight(agentSineCode,flightNumber,departureAirport);
    }

    public Flight close(String agentSineCode, String flightNumber, String departureAirport) {
        return dataRepository.closeFlight(agentSineCode,flightNumber,departureAirport);
    }


    public String manifest(String agentSineCode, String flightNumber, String departureAirport) {
        return null;
    }


    public String loadSheet(String agentSineCode, String flightNumber, String departureAirport) {
        return null;
    }


}
