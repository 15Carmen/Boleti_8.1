package Ejercicio2;

public class Notas {

    /*
    Ejercicio 2.- Deseamos realizar un programa para el cálculo de ciertos valores con las notas de la
    clase. Queremos calcular la nota media, la nota más alta, la más baja, cuántos alumnos tienen una
    nota superior a la media y cuántos tienen una nota inferior a la media. El programa debe presentar
    un menú de opciones para que el usuario elija lo que desee hacer y también se presentarán los
    resultados. El array de notas se generará aleatoriamente con notas de 1 a 10.

            */

    /*
    Primero necesitamos saber el número de alumnos que va a tener la clase. Esto lo hemos preguntado antes de hacer el
    menú.
     */
    static int totalAlumnos=Menu.numeroElementos();

    //Ahora necesitamos generar las notas de la clase de forma aleatoria

    public static  int [] crearRandom (int[] array){

        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*10);
        }

        return array;
    }


    //Creamos un método para calcular la nota media de la clase
    public static int notaMedia(int[]array){

        int contadorTotal=0;

        for (int i=0; i<array.length;i++){
            contadorTotal+=array[i];
        }
        return contadorTotal/totalAlumnos;
    }

    //Creamos un método para saber la nota más baja

    public static int notaMasBaja (int[] notas){

        int menor = notas[0];

        for (int i=1; i>notas.length; i++){

            if (notas[i]>menor){
                menor=notas[i];
            }
        }
        return menor;
    }

    //Creamos un método para saber la nota más alta

    public static int notaMasAlta (int[] notas){

        int mayor = notas[0];

        for (int i=1; i<notas.length; i++){

            if (notas[i]>mayor){
                mayor=notas[i];
            }
        }
        return mayor;
    }

    //Método para saber cuántos alumnos tienen una nota superior a la media

    public static int superiorMedia (int [] notas){

        int contadorNotasAltas=0;

        for(int i=0;i<notas.length;i++){

            if (notas[i]>=5){
                contadorNotasAltas++;
            }
        }
        return contadorNotasAltas;
    }

    //Método para saber cuántos alumnos tienen una nota inferior a la media

    public static int menorMedia (int [] notas){

        int contadorNotasBajas=0;

        for(int i=0;i<notas.length;i++){

            if (notas[i]<5){
                contadorNotasBajas++;
            }
        }
        return contadorNotasBajas;
    }



}
