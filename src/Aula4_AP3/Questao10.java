package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao10 {
    public static int NumConsoantes(String str){
        char chrVetor[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int flag=1, cont=0;
        for(int i=0; i<str.length(); i++){
             for(int f=0; f<26; f++){
                if(str.charAt(i)==chrVetor[f]){
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
        nome=tc.nextLine().toUpperCase();
        System.out.println("Numeros de Consoantes: "+NumConsoantes(nome));
    }
}
