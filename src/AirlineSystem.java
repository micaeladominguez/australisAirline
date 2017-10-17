import java.util.ArrayList;
import java.util.List;

/**
 * Author: micaeladominguez
 * Date: 13/10/17
 */
public class AirlineSystem {

    private List<AirplaneTicket> airplaneTickets;
    private List<Flight> flights;
    private List<Passenger> passengers;
    private List<Pilot> pilot;
    private Seat seat;

    private AirlineSystem() {
        airplaneTickets = new ArrayList<>();
        flights = new ArrayList<>();
        passengers = new ArrayList<>();
        pilot = new ArrayList<>();
    }

    private List<Flight> searchFlights(Airport origin, Airport destination) {
        final List<Flight> myFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOriginAirport().equals(origin) && flight.getArrivalAirport().equals(destination)){
                myFlights.add(flight);
            }
        }
        return myFlights;
    }

    AirplaneTicket buyTicket(String code, Passenger passenger, Seat seat) {

    }

    void showFlights() {
        for (Flight flight : flights) {
            System.out.println("Flight: " + flight + " Code: " + flight.getCode());
        }
    }
}
