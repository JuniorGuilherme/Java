package ed3;

import java.util.Scanner;

/**
 * Created by jrg_c on 09/08/2016.
 */
public class Atividade02 {
    public static void main(String[] args) {
        int vetor[] = new int[10], soma=0, i=0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite:");
            vetor[i]=teclado.nextInt();
            soma+=vetor[i];
            i++;
        }
        while( vetor[i]!=0 && i<10 );
        System.out.println("Soma dos Elementos: "+soma);
        soma=soma/i;
        System.out.println("Media: "+soma);
    }
}
