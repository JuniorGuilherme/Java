package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questão4 {
    public static int Retorna(int n1, int n2){
        return(n1+n2);
    }
    public static void main(String[] args) {
        int num1, num2;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        num1=tc.nextInt();
        System.out.println("Digite o numero 2: ");
        num2=tc.nextInt();
        System.out.println("Soma dos inteiros: "+Retorna(num1, num2));
    }
}
