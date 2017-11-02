package Interface;

import java.util.Scanner;

public class InterfacePiloto {

    public static void main(String[] args) {
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerId = new Scanner(System.in);
        String name = scannerName.nextLine();
        int id = scannerId.


        while (true){
            System.out.println("1. Consultar itinerario de viaje");
            System.out.println("2. Salir del programa");
            Scanner respuestaUser = new Scanner(System.in);
            int respuesta = respuestaUser.nextInt();
            clearScreen();

            switch (respuesta){
                case 1:
                    //metodo para checkear itinerarios de viaje
                    break;
            }
        }

    }

    public static void clearScreen() {
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
    }

    public static void imprimirI() {
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
    }
}
