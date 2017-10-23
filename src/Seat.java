
public class Seat {

    private final TypeSeat typeSeat;
    private boolean isEmpty;
    private SeatLocation seatlocation;

    public Seat(TypeSeat typeSeat,int seatRow,char seatColumn) {
        this.typeSeat = typeSeat;
        this.isEmpty = true;
        this.seatlocation = new SeatLocation(seatRow, seatColumn);
    }

    public TypeSeat getTypeSeat() {
        return typeSeat;
    }

    public SeatLocation getSeatlocation() {
        return seatlocation;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
