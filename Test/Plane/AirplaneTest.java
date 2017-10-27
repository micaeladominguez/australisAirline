package Plane;

import org.junit.Test;

import static Plane.Airplane.nombreDeAsiento;
import static org.junit.Assert.*;


public class AirplaneTest {
    @org.junit.Test
    public void getCode() throws Exception {
    }

    @Test
    public void avionPuto(){
        System.out.println(nombreDeAsiento(1,0));
        System.out.println(nombreDeAsiento(1,1));
        System.out.println(nombreDeAsiento(1,2));
        System.out.println(nombreDeAsiento(1,3));
        System.out.println(nombreDeAsiento(1,4));
    }

}