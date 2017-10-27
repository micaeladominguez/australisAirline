package Plane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Airplane {


    /*
    falta ver como hacer para definir asientos business
     */


    private final String code;
    Seat[][] mapaDeAsientos;

    public Airplane(String code, int row, int columns) {
        this.code = code;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                mapaDeAsientos[i][j]= new Seat(new Economic());
            }
        }
    }

    public static String nombreDeAsiento(int row, int columms){
        return ""+row+(char)(columms+65);
    }

    public String getCode() {
        return code;
    }
}
