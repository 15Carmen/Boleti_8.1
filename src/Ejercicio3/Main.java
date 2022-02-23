package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] asientosNoFumadores = new int[16];
        int[] asientosFumadores = new int[4];
        boolean salirPrincipal = false,salirReservas;

        do {
            salirReservas = false;
            switch (Vuelo.menuPrincipal(new Scanner(System.in))){
                case 1 : {
                    do{
                        switch (Vuelo.menuReservas(new Scanner(System.in))){
                            case 1 : {
                                Vuelo.reservarAsientoNoFumadores(asientosNoFumadores);
                            }break;
                            case 2 : {
                                Vuelo.reservarAsientoFumadores(asientosFumadores);
                            }break;
                            case 3 : {
                                salirReservas = true;
                            }break;
                            default:
                                System.out.println("Esa opcion no existe.");
                        }
                    }while (!salirReservas);
                }break;
                case 2 : {
                    salirPrincipal = true;
                }break;
                default:
                    System.out.println("Esa opcion no existe.");

            }
        }while(!salirPrincipal);
    }

}
