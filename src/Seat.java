
public class Seat {

    private final TypeSeat typeSeat;
    private final SeatLocation seatLocation;
    private boolean isEmpty;

    public Seat(TypeSeat typeSeat, SeatLocation seatLocation, boolean isEmpty) {
        this.typeSeat = typeSeat;
        this.seatLocation = seatLocation;
        this.isEmpty = true;
    }

    public TypeSeat getTypeSeat() {
        return typeSeat;
    }

    public SeatLocation getSeatLocation() {
        return seatLocation;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
