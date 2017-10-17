public class SeatLocation {

    private final int seatRow;
    private final char seatColumn;

    public SeatLocation(int seatRow, char seatColumn) {
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public char getSeatColumn() {
        return seatColumn;
    }
}
