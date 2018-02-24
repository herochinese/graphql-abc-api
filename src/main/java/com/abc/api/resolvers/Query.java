package com.abc.api.resolvers;

import com.abc.api.DataRepository;
import com.abc.api.types.Boarding;
import com.abc.api.types.Flight;
import com.abc.api.types.SeatMap;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private DataRepository dataRepository;


    public List<Flight> flights(Optional<String> flightNumber) {

        return dataRepository.getFlights().values().stream().filter(flight -> "*".equals(flightNumber.get())?true:flight.getFlightNumber().equals(flightNumber)).collect(Collectors.toList());
    }


    public List<Boarding> boardings(String flightNumber) {
        return dataRepository.getBoardings().values().stream().filter(boarding-> "*".equals(flightNumber)?true:boarding.getFlight().getFlightNumber().equals(flightNumber)).collect(Collectors.toList());
    }

    public SeatMap seatMap(String flightNumber) {
        return dataRepository.getFlights().values().stream().filter(flight -> flight.getFlightNumber().equals(flightNumber)).findFirst().get().getSeatMap();
    }

}
