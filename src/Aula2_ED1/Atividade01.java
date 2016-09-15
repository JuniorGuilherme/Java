package Aula2_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 09/08/2016.
 */
public class Atividade01 {
    public static void main(String[] args) {
        int vetor[] = new int[10], num = 0, soma = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            vetor[i] = teclado.nextInt();
            soma += vetor[i];
            if (vetor[i] > num) {
                num = vetor[i];
            }
        }
        System.out.println("Maior Numero: " + num);
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < num) {
                num = vetor[i];
            }
        }
        System.out.println("Menor Numero: " + num);
        System.out.println("Soma: " + soma);
    }

}
