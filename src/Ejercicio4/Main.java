package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca el numero de elementos que desea introducir en el array");

        int num = sc.nextInt();

        int [] erastotenes = Erastotenes.montarCriba(num);




    }
}
