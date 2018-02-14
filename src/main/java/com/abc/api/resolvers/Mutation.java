package com.abc.api.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private BoardOperation boardOperation;

    @Autowired
    private DeboardOperation deboardOperation;

    @Autowired
    private FlightOperation flightOperation;

    public BoardOperation board() {
        return boardOperation;
    }

    public DeboardOperation deboard() {
        return deboardOperation;
    }

    public FlightOperation flight() {
        return flightOperation;
    }
}
