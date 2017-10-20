
public class Seat {

    private final TypeSeat typeSeat;
    private boolean isEmpty;
    private String seatlocation;

    public Seat(TypeSeat typeSeat,int seatRow,char seatColumn) {
        this.typeSeat = typeSeat;
        this.isEmpty = true;
        seatlocation= ""+seatRow+seatColumn;
    }

    public TypeSeat getTypeSeat() {
        return typeSeat;
    }

    public String getSeatlocation() {
        return seatlocation;
    }

    public boolean isEmpty() {

        return isEmpty;
    }
}
