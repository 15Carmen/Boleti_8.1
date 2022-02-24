package Ejercicio4;

/**
 * el metodo principal consiste en pedir por consola el número N que será el máximo número para la obtención de los
 * primos
 * posteriormente con ese numero crearemos nuestro array y lo llenaremos de números impares a partir del tres
 * Con el método buscarPrimos recorremos la tabla según el método de Erastótenes para quedarnos solo con los
 * primos
 * Finalmente imprimimos los números primos
 *
 */
public class Main {
    public static void main(String[] args) {
        int numero=Erastotenes.pedirNumero();
        int [] arrayOriginal=new int[numero];
        Erastotenes.cargarArray(arrayOriginal,numero);//llenamos el array de numeros impares a partir del 3
        Erastotenes.buscarPrimos(arrayOriginal,numero);  // seleccionamos solo los primos conforme al método de
        //Erastótenes
        Erastotenes.mostrarNumPrimos(arrayOriginal);//mostramos los números primos por pantalla
    }
}