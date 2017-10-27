import Plane.Airplane;

import java.util.ArrayList;
import java.util.List;

class Flight {

    private final List<Employee> staffList;
    private final Airport originAirport;
    private final Airport arrivalAirport;
    private final Airplane airplane;
    private final String code;
    private final Pilot pilot;
    private final Date date;
    private Date startDate;
    private Date finalDate;
    private int priceBusiness;
    private int priceEconomic;
    //private final int scales;

    Flight(Airport originAirport, Airport arrivalAirport, Airplane airplane,
           String code, Pilot pilot, Date date, int scales) {
        staffList = new ArrayList<>();
        this.originAirport = originAirport;
        this.arrivalAirport = arrivalAirport;
        this.airplane = airplane;
        this.code = code;
        this.pilot = pilot;
        this.date = date;
        //this.scales = scales;
    }

    /*int getScales() {
        return scales;
    }*/

    Date getDate() {
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

/*
 hay que ver lo de las fechas, los vuelos tienen que tener una fecha de llegada y salida.
 */