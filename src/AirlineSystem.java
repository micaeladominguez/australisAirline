import java.util.ArrayList;
import java.util.List;

/**
 * Author: micaeladominguez
 * Date: 13/10/17
 */
abstract class AirlineSystem {

    private final List<AirplaneTicket> airplaneTickets;
    private final List<Flight> flights;
    private final List<Passenger> clients;
    private final List<Pilot> pilot;
    private final List<Employee> employees;

    AirlineSystem() {
        airplaneTickets = new ArrayList<>();
        flights = new ArrayList<>();
        clients = new ArrayList<>();
        pilot = new ArrayList<>();
        employees = new ArrayList<>();
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

    /*private List<Flight> searchFlights(int scales){ //falta agregar "Airport origin, Airport destination" tema filtros
        final List<Flight> myFlights = new ArrayList<>();
        for (Flight flight: flights) {
            if (flight.getScales() == scales) {
                myFlights.add(flight);
            }
        }
        return myFlights;
    }*/
    // ESTA COMENTADO ya que el metodo getScales no esta terminado y no permite compilar.

    void showFlights() {
        for (Flight flight : flights) {
            System.out.println("Flight: " + flight + " Code: " + flight.getCode());
        }
    }
}
/*
metodos a realizar:
-comprar
-vender
-consultar itinerario
....
 */
