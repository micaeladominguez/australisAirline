package Interface;

import java.util.Scanner;

public class InterfaceFormularioCompra {

    public static void main(String[] args) {

        //elegir mejores nombres para variables y en ingles, estoy poco inspirado
        //se puede mejorar los textos de los sout

        //falta agregar otra categoria para ver sus reservas


        //informacion visual
        String formulario1 = "";
        String formulario2 = "";
        String formulario3 = "";
        String formulario4 = "";
        String formulario5 = "";
        String formulario6 = "";

        //informacion para ser enviadas a los metodos al confirmar
        String aeropuertoSalida;
        String aeropuertoLlegada;
        int cantidadDePasajeros;
        int cantidadDeEscalas;
        int cantidadAsientosPrimera;
        int cantidadAsientosEconomica;


        while (true) {

            Scanner respuestaUser = new Scanner(System.in);


            System.out.println("1. Aeropuerto   de   origen   y   destino: ");
            System.out.print(formulario1);
            System.out.println("2. Fechas   de   salida   y   llegada");
            System.out.print(formulario2);
            System.out.println("3. Cantidad   de   pasajeros");
            System.out.print(formulario3);
            System.out.println("4. Cantidad   de   escalas   máxima");
            System.out.print(formulario4);
            System.out.println("5. Categoría   deseada");
            System.out.print(formulario5);
            System.out.println("6. Selección de criterio de orden para los resultados");
            System.out.print(formulario6);
            System.out.println("7. Confirmar");
            System.out.println("8. Salir del programa ???"); //no se si poner esto

            int respuesta = respuestaUser.nextInt();
            clearScreen();

            switch (respuesta) {

                case 1:
                    System.out.println("Ingrese el nombre del aeropuerto de salida:"); //defender aeropuertos inexistentes
                    Scanner scannerAeropuerto1 = new Scanner(System.in);
                    aeropuertoSalida = scannerAeropuerto1.nextLine();
                    System.out.println("Ingrese el nombre del aeropuerto de llegada:");
                    Scanner scannerAeropuerto2 = new Scanner(System.in);
                    aeropuertoLlegada = scannerAeropuerto2.nextLine();

                    formulario1 = "Origen: " + aeropuertoSalida + "    Llegada: " + aeropuertoLlegada + "\n";
                    clearScreen();
                    break;
                case 2:
                    /*
                    este no lo defini porque hay que ver si vamos a usar  la clase Date creada por nosotros o usar la
                    de java, el problema de la defensa de codigo, poner un dia como 35 o negativo. Antes de definir esto
                    hay que terminar lo de la fecha y hora.
                     */
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de pasajeros:");
                    Scanner scannerCantidadDePersonas = new Scanner(System.in);
                    cantidadDePasajeros = scannerCantidadDePersonas.nextInt();                //defender si pone mas de x personas o negativas

                    formulario3 = "Nº Pasajeros: "+ cantidadDePasajeros +"\n";
                    clearScreen();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de escalas:");
                    Scanner scannerEscalas = new Scanner(System.in);
                    cantidadDeEscalas = scannerEscalas.nextInt();                    //defender para poner entre 0 y 4 o indiferentes

                    formulario4 = "Nº de escalas: "+ cantidadDeEscalas +"\n";        //5 podria ser para que sea indiferente la cantidad de escalas
                    clearScreen();
                    break;
                case 5:
                    /*duda, todos los pasajero van a comprar en la misma clase o puede ser que x cantidad de pasajeros
                    compren en primera clase y los restantes en turistas, si esto es asi tambien hay que defender si
                    ponen una suma de asientos mas grandes que los pasajeros asignados anteriormente
                     */
                    System.out.println("Ingrese la cantidad de asientos de primera clase:");
                    Scanner scannerAsientosPrimera = new Scanner(System.in);
                    cantidadAsientosPrimera = scannerAsientosPrimera.nextInt();

                    System.out.println("Ingrese la cantidad de asientos de clase economica:");
                    Scanner scannerAsientosEconomicas = new Scanner(System.in);
                    cantidadAsientosEconomica = scannerAsientosEconomicas.nextInt();

                    /*aca se podria mejorar haciendo que, si no se compra ningun asiento de primera que no
                    se muestre asientos en primara clase: 0*/

                    formulario5 = "Asientos en primera clase: "+ cantidadAsientosPrimera + "        Asientos de clase economica : " + cantidadAsientosEconomica + "\n";
                    clearScreen();

                    break;
                case 6:
                    //instrucciones;
                    break;
                case 7:
                    /*llamar a todos los metodos necesarios para verificar si es posible lo que pide el cliente
                    verificar que el usuario no puso aeropuertos inexistentes
                    1- verificar si hay vuelos entre los aeropuerto
                    2- verificar si cumplen con las fechas que el usuario quiere
                     */
                case 8:
                    System.exit(1);
                default:
                    //sentencias;
                    break;

            }
        }
    }

    //mejorar esto, hay varias soluciones pero el problema es que varia entre mac, linux y windows
    public static void clearScreen() {
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
    }
}
