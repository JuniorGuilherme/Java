package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao9 {
    public static int NumConsoantes(String n){
        char chrVetor[]= {'a', 'e', 'i', 'o', 'u'};
        int flag=1, cont=0;
        for(int i=0; i<n.length(); i++){
            for(int f=0; f<5; f++){
                if(n.charAt(i)==chrVetor[f]){
                    flag=0;
                }
            }
            if(flag==1){
                cont++;
            }
            flag=1;
        }
        return(cont);
    }
    public static void main(String[] args) {
        String nome;
        Scanner tc = new Scanner(System.in);
        System.out.println("String: ");
        nome=tc.nextLine().toLowerCase();
        System.out.println("Numeros de Consoantes: "+NumConsoantes(nome));
    }
}
