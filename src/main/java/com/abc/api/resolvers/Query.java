package com.abc.api.resolvers;

import com.abc.api.DataRepository;
import com.abc.api.types.Boarding;
import com.abc.api.types.Flight;
import com.abc.api.types.SeatMap;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private DataRepository dataRepository;

    public Flight flight(String flightNumber) {
        return dataRepository.getFlights().values().stream().filter(flight -> flight.getFlightNumber().equals(flightNumber)).findFirst().orElseGet(null);
    }

    public List<Flight>flights(String flightNumber) {
        return dataRepository.getFlights().values().stream().filter(flight -> "*".equals(flightNumber)?true:flight.getFlightNumber().equals(flightNumber)).collect(Collectors.toList());
    }


    public Boarding boarding(String flightNumber) {
        return null;
    }

    public SeatMap seatMap(String flightNumber) {
        return null;
    }

}
