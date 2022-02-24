package Ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Main_David {

    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        pintarArray(sacarPrimos(menu()));

    }


    /**Se pintara el menu con la opcionde sair, la salida sera la opcion elejida
     *
     * @return
     */

    public static int menu(){

        int res;

        do {
            System.out.println("Hasta que numero desea sacar los primos?");
            res = validarEntero();

            if(res<0){
                System.out.println("Introduzca un valor correcto");
            }

        }while (res<0);

        return res;
    }

    /**
     * Evitara una exepcion pidiendo el bucle un entero hasta que se introduzca un dato correcto
     * @return
     */

    private static int validarEntero(){

        boolean salir=false;
        int res=0;

        do{

            try {
                res=sc.nextInt();
                salir=true;

            }catch (Exception a){
                sc.nextLine();
                System.out.println("Error, vuelva a intentarlo");
                salir=false;

            }

        }while (salir==false);

        return res;
    }

    /**
     * Pintara el array por pantalla
     * @param array
     */

    public static void pintarArray(int[] array){

        for(int x:array){
            System.out.print(x+" ");
        }

    }

    /**
     * Este metodo devolvera un array con todos los primos hasta un limite que se introducira por parametros
     * @param limite
     * @return
     */

    public static int[] sacarPrimos(int limite){

        int[] primos;
        primos=crearArrayConImpares(limite);

        for (int i = 0; primos[i]<Math.sqrt(limite); i++) {

            for (int j = i+1; j <primos.length ; j++) {

                if(primos[j]%primos[i]==0){
                    primos=eliminarPosicionCentral(primos,j);
                }
            }
        }

        return primos;
    }

    /**
     * Eliminira una posicion que se introducira por parametros de un array introducido por parametros
     * @param array
     * @param posicionAEliminar
     * @return
     */

    public static int[] eliminarPosicionCentral(int[]array, int posicionAEliminar){

        for (int i=posicionAEliminar; i<array.length-1;++i){
            array [i]=array[i+1];
        }

        return Arrays.copyOf(array, array.length-1);
    }

    /**
     * Creara un array con los numeras impares del tamaño introducido por parametros
     * @param limite
     * @return
     */

    public static int[] crearArrayConImpares(int limite){

        int[] impares;

        if(limite%2==0){
            impares=new int[(limite/2)-1];

        }else {
            impares=new int[(limite/2)];

        }
        for(int i=0; i<impares.length;++i){
            impares[i]=((i+1)*2)+1;

        }

        return impares;
    }
}
