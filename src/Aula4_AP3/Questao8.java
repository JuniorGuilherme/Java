package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao8 {
    public static int RetornaNumVogais (String n){
        char chrVetor[]={'a', 'e', 'i', 'o', 'u'};
        int cont=0;
        for(int i=0; i<n.length(); i++){
            for(int f=0; f<5; f++){
                if(n.charAt(i)==chrVetor[f])
                    cont++;
            }
        }
        return(cont);
    }
    public static void main(String[] args) {
        String nome;
        Scanner tc = new Scanner(System.in);
        System.out.println("String: ");
        nome=tc.nextLine();
        System.out.println("Numero de vogais: "+RetornaNumVogais(nome));
    }
}
