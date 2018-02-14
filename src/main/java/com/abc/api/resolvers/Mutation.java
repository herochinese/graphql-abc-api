package com.abc.api.resolvers;

import com.abc.api.types.Boarding;
import com.abc.api.types.Flight;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {


    public Boarding board(String firstName, String lastName, String pnr, String seatNumber, String flightNumber) {
        return null;
    }
    public Boarding deboard(String firstName, String lastName, String pnr, String seatNumber, String flightNumber){
        return null;
    }
    public Flight openFlight(String agentSineCode, String flightNumber) {
        return null;
    }

}
