import java.util.ArrayList;
import java.util.List;

/**
 * Author: micaeladominguez
 * Date: 13/10/17
 */
public abstract class AirlineSystem {

    private final List<AirplaneTicket> airplaneTickets;
    private final List<Flight> flights;
    private final List<Passenger> clients;
    private final List<Pilot> pilot;

    private AirlineSystem() {
        airplaneTickets = new ArrayList<>();
        flights = new ArrayList<>();
        clients = new ArrayList<>();
        pilot = new ArrayList<>();
    }

    private List<Flight> searchFlights(Airport origin, Airport destination) {
        final List<Flight> myFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOriginAirport().equals(origin) && flight.getArrivalAirport().equals(destination)) {
                myFlights.add(flight);
            }
        }
        return myFlights;
    }

    private List<Flight> searchFlights(int scales){
        final List<Flight> myFlights = new ArrayList<>();
        for (Flight flight: flights) {
            if (flight.getScales() == scales) {
                myFlights.add(flight);
            }
        }
        return myFlights;
    }

    void showFlights() {
        for (Flight flight : flights) {
            System.out.println("Flight: " + flight + " Code: " + flight.getCode());
        }
    }

}
