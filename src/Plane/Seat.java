package Plane;

public class Seat {

    private boolean isEmpty;
    TypeSeat tipoDeAsiento;

    public Seat(TypeSeat tipoDeAsiento) {
        this.isEmpty = true;
        this.tipoDeAsiento = tipoDeAsiento;
    }
}
