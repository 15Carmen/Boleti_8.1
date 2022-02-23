package Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static String leerOpcion(){
        return sc.nextLine();
    }

    public static int numeroElementos(){
        System.out.println("¿Cuántos alumnos hay en la clase?");
        return sc.nextInt();
    }

    public static void crearMenu(){

        System.out.println("""
               Elija la opción que desee realizar:
               
              1. Calcular nota media de la clase
              2. Saber la nota más alta de la clase
              3. Saber la nota más baja de la clase
              4. Cuántos alumnos tienen una nota superior a la media
              5. Cuántos alumnos tienen una nota inferior a la media
              6. Salir del programa
                """);

    }

    public static void pintarMenu(){

        String opc;
        boolean salir=false;

        int [] notas=new int [Notas.totalAlumnos];
        Notas.crearRandom(notas);

        do{
            crearMenu();
            opc = leerOpcion();

            switch (opc){

                case "1":
                    System.out.println("La nota  media de la clase es: " + Notas.notaMedia(notas)+"\n");
                    break;

                case "2":
                    System.out.println("La nota más baja de la clase es: "+ Notas.notaMasBaja(notas)+"\n");
                    break;

                case "3":
                    System.out.println("La nota más alta de la clase es: "+ Notas.notaMasAlta(notas)+"\n");
                    break;

                case "4":System.out.println("Los alumnos por encima de la media son: " + Notas.superiorMedia(notas)+"\n");
                    break;

                case "5":System.out.println("Los alumnos por debajo de la media: "+ Notas.menorMedia(notas)+"\n");
                    break;

                case "6":
                    salir=true;
                    break;

                default:
                    System.out.println("Esta opción no se encuentra en el menú, por favor escoja una de las opciones ofrecidas en él.");
            }

        }while (!salir);
    }

}
