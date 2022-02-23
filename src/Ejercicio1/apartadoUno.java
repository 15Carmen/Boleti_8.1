package Ejercicio1;

public class apartadoUno {

    /*
     * Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga los
     * elementos pares que se encuentran en el primero.
     */

    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }



}
