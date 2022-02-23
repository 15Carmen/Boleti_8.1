package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Vuelo {

    static Scanner sc = new Scanner(System.in);

    public static int menuPrincipal(Scanner sc){

        System.out.println("-------------------[MENU PRINCIPAL]-------------------");
        System.out.println("""
                [1] - Reservar un asiento.
                [2] - Salir.""");
        System.out.println("------------------------------------------------------");
        return sc.nextInt();

    }

    public static int menuReservas(Scanner sc){

        System.out.println("-------------------[MENU RESERVAS]-------------------");
        System.out.println("""
                [1] - Reservar en zona no fumadores.
                [2] - Reservar en zona fumadores.
                [3] - Salir.""");
        System.out.println("-----------------------------------------------------");
        return sc.nextInt();
    }

    private static int pedirAsiento(){

        System.out.println("¿Que asiento quieres reservar?");

        return sc.nextInt();
    }

    public static void reservarAsientoNoFumadores(int[] asientosNoFumadores){

        boolean zonaNoFumadores = false;
        int asiento;
        do{
            if(comprobarZonaLlena(asientosNoFumadores) < asientosNoFumadores.length){

                mostrarAsientosNoFumadores(asientosNoFumadores);
                asiento = pedirAsiento();

                if(asiento>=0 && asiento<=asientosNoFumadores.length){
                    if(asientosNoFumadores[asiento] == 0){
                        System.out.println("Se ha reservado el asiento en la zona no fumadores.");
                        asientosNoFumadores[asiento] = 1;
                        zonaNoFumadores = true;
                    }else if(asientosNoFumadores[asiento] == 1){
                        System.out.println("Ese asiento ya esta ocupado, elija otro.");
                        zonaNoFumadores = false;
                    }
                }else{
                    System.out.println("Ese asiento no corresponde a la zona no fumadores.");
                    zonaNoFumadores = false;
                }
            }else{
                System.out.println("La zona de no fumadores esta llena.");
                zonaNoFumadores = true;
            }

        }while(!zonaNoFumadores);
    }

    public static void reservarAsientoFumadores(int[] asientosFumadores){

        boolean zonaFumadores = false;
        int asiento;
        String opcion;
        do{
            if(comprobarZonaLlena(asientosFumadores) < asientosFumadores.length){

                mostrarAsientosFumadores(asientosFumadores);
                asiento = pedirAsiento();

                if(asiento>=0 && asiento<=asientosFumadores.length){
                    if(asientosFumadores[asiento] == 0){
                        System.out.println("Se ha reservado el asiento en la zona de fumadores.");
                        asientosFumadores[asiento] = 1;
                        zonaFumadores = true;
                    }else if(asientosFumadores[asiento] == 1){
                        System.out.println("Ese asiento ya esta ocupado, elija otro.");
                        zonaFumadores = false;
                    }
                }else{
                    System.out.println("Ese asiento no corresponde a la zona fumadores.");
                    zonaFumadores = false;
                }
            }else{
                System.out.println("Zona de fumadores llena. ¿Desea reservar en la zona no fumadores? (S/N)");
                opcion = sc.next();
                switch (opcion.toUpperCase()){
                    case "S" ->{
                        System.out.println("Construyendo. No me sale por que no se como comunicar este metodo con el otro pasandole un array, ya que si le paso asientosFumadores el metodo tendria 4 de longitud. ");
                        zonaFumadores = true;
                    }
                    case "N" -> zonaFumadores = true;
                }
            }



        }while(!zonaFumadores);
    }

    public static void mostrarAsientosNoFumadores(int[] asientosNoFumadores){

        System.out.println("----------------------------------[ASIENTOS DEL AVION]----------------------------------");
        for (int i = 0; i < asientosNoFumadores.length; i++) {
            if(asientosNoFumadores[i] == 0){
                System.out.println("El asiento ["+i+"] de la zona no fumadores esta libre.");
            }else if(asientosNoFumadores[i] == 1){
                System.out.println("El asiento ["+i+"] de la zona no fumadores esta ocupado.");
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void mostrarAsientosFumadores(int[] asientosFumadores){

        System.out.println("----------------------------------[ASIENTOS DEL AVION]----------------------------------");
        for (int i = 0; i < asientosFumadores.length; i++) {
            if(asientosFumadores[i] == 0){
                System.out.println("El asiento ["+i+"] de la zona fumadores esta libre.");
            }else if(asientosFumadores[i] == 1){
                System.out.println("El asiento ["+i+"] de la zona fumadores esta ocupado.");
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static int comprobarZonaLlena(int[] asientos){

        int x = 0;

        for (int i = 0; i < asientos.length; i++) {
            if(asientos[i] == 1){
                x++;
            }
        }
        return x;
    }
}

