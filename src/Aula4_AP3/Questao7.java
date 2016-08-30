package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao7 {
    public static String MaiorAlf(String n1, String n2) {
        char chrVetor[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int pos1=0, pos2=0;
        for (int i = 0; i < 26; i++) {
            if (n1.charAt(0) == chrVetor[i]) {
                pos1 = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (n2.charAt(0) == chrVetor[i]) {
                pos2 = i;
            }
        }
        if(pos1>pos2)
            return(n2);
        else if(pos2>pos1)
            return(n1);
        else
            return("Iguais.");
    }
    public static void main(String[] args) {
        String nome1, nome2;
        Scanner tc = new Scanner(System.in);
        System.out.println("String 1: ");
        nome1=tc.nextLine().toUpperCase();
        System.out.println("String 2: ");
        nome2=tc.nextLine().toUpperCase();
        System.out.println(MaiorAlf(nome1, nome2));
    }
}
