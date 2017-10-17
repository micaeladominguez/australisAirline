import java.util.ArrayList;
import java.util.List;

class Flight {

    private final List<OnBoardStaff> staffList;
    private final Airport originAirport;
    private final Airport arrivalAirport;
    private final Airplane airplane;
    private final String code;
    private final Pilot pilot;
    private Date date;

    Flight(Airport originAirport, Airport arrivalAirport, Airplane airplane, String code, Pilot pilot, Date date) {
        staffList = new ArrayList<>();
        this.originAirport = originAirport;
        this.arrivalAirport = arrivalAirport;
        this.airplane = airplane;
        this.code = code;
        this.pilot = pilot;
        this.date = date;
    }

    Date getDate(){
        return date;
    }

    Airport getOriginAirport() {
        return originAirport;
    }

    Airport getArrivalAirport() {
        return arrivalAirport;
    }

    Airplane getAirplane() {
        return airplane;
    }

    String getCode() {
        return code;
    }

    Pilot getPilot() {
        return pilot;
    }
}
