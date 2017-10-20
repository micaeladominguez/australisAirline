import java.util.ArrayList;
import java.util.List;

/**
 * Author: micaeladominguez
 * Date: 13/10/17
 */
public class StaffAirplaneSystem extends AirlineSystem {
    private List<Pilot>pilots;
    private List<Employee> employees;

    private StaffAirplaneSystem() {
        //super();
        pilots= new ArrayList<>();
        employees= new ArrayList<>();
    }

    private String consultItinerary(Pilot pilot){
        for (Pilot p : pilots){
            if(pilot.getId() == p.getId()){
                return pilot.getFlightcode();
            }
        }
        return "has no flights to perform";
    }

    private String consultItinerary(Employee e){
        for (Employee employee: employees){
            if (e.getId()==employee.getId()){
                return employee.getFlightcode();
            }
        }
        return "has no flights to perform";
    }
}

/*
como esta clase extiende de AirlineSystem tenemos que buscar a forma de que pued acceder a las listas.
 */
