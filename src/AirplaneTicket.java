import Plane.Seat;

class AirplaneTicket {

    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;

    AirplaneTicket(Flight flight, Passenger passenger, Seat seat) {
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
    }

    Flight getFlight() {
        return flight;
    }

    Passenger getPassenger() {
        return passenger;
    }

    Seat getSeat() {
        return seat;
    }
}
