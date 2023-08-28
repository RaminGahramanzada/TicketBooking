package az.iktlab.controller;

import az.iktlab.model.Flight;
import az.iktlab.service.FlightService;
import az.iktlab.service.impl.FlightServiceImpl;

import java.util.List;

public class FlightController {
    private final FlightService flightService = new FlightServiceImpl();
    public List<Flight> getAllFlightsFromKiev() {
        return flightService.getAllFlightsFromKiev();
    }


    public Flight getFlightById(Integer id) {
        return flightService.getFlightById(id);
    }


    public List<Flight> getAllFlightsByDestinationAndTimeAndCount() {
        return null;
    }
}
