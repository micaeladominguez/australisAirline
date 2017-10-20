import java.util.ArrayList;
import java.util.List;

/**
 * Author: micaeladominguez
 * Date: 13/10/17
 */
public class StaffAirplaneSystem {
    private List<Pilot>pilots;
    private List<OnBoardStaff> staff;

    private StaffAirplaneSystem() {
        pilots= new ArrayList<>();
        staff= new ArrayList<>();
    }
    private String consultStatus(Pilot pilot){
        for (Pilot p : pilots){
            if(pilot.getId() == p.getId()){
                return pilot.getFlightcode();
            }
        }
        return "usted no esta registrado en la base de datos de pilotos";
    }
    private String consultStatus(OnBoardStaff s){
        for (OnBoardStaff staff1: staff){
            if (s.getId()==staff1.getId()){
                return staff1.getFlightcode();
            }
        }
        return "usted no esta registrado en la base de datos de la tripulacion";
    }


}
