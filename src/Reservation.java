public class Reservation {

    private final Passenger passenger;
    private final Date date;
    private float price;
    private final Seat seat;
    private final Flight flight;

    public Reservation(Passenger passenger, Date date, float price, Seat seat, Flight flight) {
        this.passenger = passenger;
        this.date = date;
        this.price = price;
        this.seat = seat;
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Date getDate() {
        return date;
    }
}
