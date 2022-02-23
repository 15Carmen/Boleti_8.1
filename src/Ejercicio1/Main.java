package Ejercicio1;



public class Main {

    public static void main(String[] args) {

        //Apartado 1

       /*
       Crear un array con números aleatorios. Como el ejercicio no
       lo especifica, yo haré un array de 10 elementos con números aleatorios
       entre 0 y 100
        */

        int Array[] = new int[10];

        for (int i=0; i<=99; i++){
            Array[i] = (int)(Math.random()*100+0);

            System.out.println("array"+i+"-->"+Array[i]);
        }


    }
}

