package Ejercicio5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] solu;
        int contador=0;
        Juego.almacenarNumero();
        System.out.println(Arrays.toString(Juego.adivinalo));
        do {
            System.out.println("Llevas : " + contador + " movimientos.");
            Juego.rellenarPosicion();
            solu = Juego.adivinarNumero();
            System.out.println(Arrays.toString(solu));
            contador++;
        }while (contador<=Juego.MAXIMASJUGADAS);
    }
}