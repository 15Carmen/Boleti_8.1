package Ejercicio4;

public class Erastotenes {

    //metodo para montar el array de impares
    public static int[] montarCriba(int num){
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
