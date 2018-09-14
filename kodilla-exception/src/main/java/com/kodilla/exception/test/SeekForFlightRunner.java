package com.kodilla.exception.test;

public class SeekForFlightRunner {
    public static void main(String[] args) {
        SeekForFlight seekForFlight = new SeekForFlight();

        //Both airports are available/true.
        try {
            seekForFlight.findFilght(new Flight("Lublin Airport", "Modlin Airport"));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Have a good day.");

        }

        //One of airports is unavailable/false.
        try {
            seekForFlight.findFilght(new Flight("Barcelona Airport", "Modlin Airport"));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Find new flight?");

        }

        //Requested airport is not present in the  mao
        try {
            seekForFlight.findFilght(new Flight("Kolonia Airport", "Bon Airport"));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight is unavailable.");
        } finally {
            System.out.println("We are very sorry but both airports are unavailable. Change airport?");

        }
    }
}
