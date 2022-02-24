package Ejercicio4;

import java.util.Scanner;
public class Erastotenes {

    //metodo para pedir número

    public static int pedirNumero() {
        Scanner scanner=new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduzca un numero positovo mayor que 0");
        boolean valido=false;
        while (!valido){
            try {
                numero=scanner.nextInt();
                if (numero<=0){
                    System.out.println("introduzca un numero positivo");
                    scanner.nextLine();
                }
                else {
                    valido=true;
                }
            }
            catch (Exception e){
                System.out.println("valor no válido, ha de ser entero mayor que 0");
                scanner.nextLine();
            }
        }
        return numero;
    }

    //metodo para montar el array de impares

    public static void cargarCriba(int[] criba, int num){

        criba[0]=3;
        int i=1, calculo=0;
        boolean continuar=true;

        while (continuar){
            calculo=criba[i-1]+2;

            if (calculo<=num){
                criba[i]=calculo;
                i++;

            }else{
                continuar = false;
            }
        }

    }

   /* public static int[] montarCriba(int num){
        int [] criba = new int [num];
        criba[0]=3;
        for (int i= 1; i<num; i++){
            criba[i]=criba[i-1]+2;
        }
        return criba;
    }

    public static int[] montarCribaWhile(int num){
        int [] criba = new int [num];
        criba[0]=3;
        int i=1;
        while (i<num){
            criba[i]=criba[i-1]+2;
            i++;
        }
        return criba;
    }
*/
    //metodo para recorrer el array
    public static int[] recorrerCriba(int [] criba, int num){
        int limite = (int) Math.sqrt(num);
        int i=0, j=0;
        while(criba[i]<limite){
            while(j<=num-1){
                j=criba[i]+j;
                criba[j]=0;
            }
            i++;
        }
        return criba;
    }


    public static int[] cribaConFor(int [] criba, int num){
        int limite = (int) Math.sqrt(num);
        for (int i=0; criba[i]<limite;i++){
            for (int j=0; j<num-1; j=criba[i]+j){
                criba[j]=0;
            }
        }
        return criba;
    }

    public static void imprimirCriba(int[] criba){
        for (int i = 0; i< criba.length;i++){
            if(criba[i]!=0){
                System.out.println(criba[i]);
            }
        }
    }

}
