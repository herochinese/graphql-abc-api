package com.abc.api.resolvers;

import com.abc.api.DataRepository;
import com.abc.api.types.Boarding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardOperation {

    @Autowired
    private DataRepository dataRepository;

    public Boarding boardByName(String firstName, String lastName, String flightNumber){
        Boarding boarding = dataRepository.getBoarding(firstName,lastName,flightNumber);
        dataRepository.addBoarding(boarding);
        return boarding;

    }
    public Boarding boardByPNR(String pnr, String flightNumber) {
        Boarding boarding = dataRepository.getBoarding(flightNumber);
        dataRepository.addBoarding(boarding);
        return boarding;

    }

    public Boarding boardByBarcode(String barcode, String scannerName) {
        Boarding boarding = dataRepository.getBoardingwithScanner(scannerName);
        dataRepository.addBoarding(boarding);
        return boarding;
    }

    public Boarding boardBySeatNumber(String seatNumber, String flightNumber) {
        Boarding boarding = dataRepository.getBoarding(flightNumber);
        dataRepository.addBoarding(boarding);
        return boarding;
    }

}
