package Ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Juego {

    static final int MAXIMO = 4, MAXIMASJUGADAS= 12;
    static int [] adivinalo = new int[MAXIMO];
    static int [] jugador = new int[MAXIMO];
    static Scanner sc = new Scanner(System.in);

    public static void rellenarPosicion (){
        int num;
        for (int i = 0; i< jugador.length; i++){
            System.out.println("Inserta un número");
            num= leerNumero();
            jugador[i]=num;
        }
    }

    public static void almacenarNumero (){
        for (int i = 0; i< adivinalo.length; i++){
            adivinalo[i]=(int)(Math.random()*10);
            for (int j=0; j<i; j++){
                if (adivinalo[i] == adivinalo[j]) {
                    adivinalo[i]=(int) (Math.random() * 11);
                    j=0;
                }
            }
        }
    }
    public static void fallarNumero (int num) {
        for (int i = 0; i< adivinalo.length; i++){
            for (int j = 0; j< jugador.length; j++){
                if (adivinalo[i]!= jugador[j]){
                    System.out.println("No coincide ningún número");
                }
            }
        }
    }

    public static int[] adivinarNumero (){
        int [] solucion = new int[MAXIMO];
        Arrays.fill(solucion, -1);
        for (int i = 0; i< adivinalo.length; i++){
            for (int j = 0; j< jugador.length; j++){
                if (adivinalo[i]==jugador[j]){
                    solucion[i]=0;
                    if (i==j){
                        solucion[i]=1;
                    }
                }
            }
        }
        return solucion;
    }

    public static int leerNumero (){
        int numero = 0;
        boolean salir=false;
        do {
            try {
                numero = sc.nextInt();
                salir=true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Esto no es un número entero.");
            }
        }while (!salir);
        return numero;
    }
}