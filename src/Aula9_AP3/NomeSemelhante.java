package Aula9_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 18/09/2016.
 */
public class NomeSemelhante {
    public static boolean compareString(String x, String y){
        int cont=0, aux=0;
        for(int i=0; i<x.length(); i++){
                if (x.charAt(i) == y.charAt(cont++)) {
                    aux++;
                    if(aux==5){
                        i=x.length();
                    }
                } else {
                    aux = 0;
                }
        }
        if(aux==5){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String nome1, nome2;
        nome1=tc.next();
        nome2=tc.next();
        if(compareString(nome1, nome2)){
            System.out.println("Strings Iguais.");
        }
        else{
            System.out.println("Strings Diferentes.");
        }
    }
}