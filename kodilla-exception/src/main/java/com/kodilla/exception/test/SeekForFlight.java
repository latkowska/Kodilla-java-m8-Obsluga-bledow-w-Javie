package com.kodilla.exception.test;

import java.sql.SQLOutput;
import java.util.HashMap;

public class SeekForFlight {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> departireAirports = new HashMap<>();
        departireAirports.put("Modlin Airport", true);
        departireAirports.put("Lublin Airport", true);
        departireAirports.put("Kongo Airport", true);
        departireAirports.put("Barcelona Airport", false);
        departireAirports.put("Mocsow Airport", false);

        Boolean departureAirportIsPresent = departireAirports.get(flight.getDepartureAirport());

        HashMap<String, Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("Modlin Airport", true);
        arrivalAirports.put("Lublin Airport", true);
        arrivalAirports.put("Radom Airport", false);
        arrivalAirports.put("Charles de Gaulle Airport", true);
        arrivalAirports.put("Mocsow Airport", false);

        Boolean arrivalAirportIsPresent = arrivalAirports.get(flight.getArrivalAirport());

        if(departureAirportIsPresent == null || arrivalAirportIsPresent == null) {
            throw new RouteNotFoundException();
        } else if (departureAirportIsPresent && arrivalAirportIsPresent) {
            System.out.println("Flight is available.");
        } else {
            System.out.println("Flight is unavailable.");
        }
    }
}

