package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questão5 {
    public static int MaiorValor(int n1, int n2){
        if(n1>n2)
            return(n1);
        else
            return(n2);
    }
    public static void main(String[] args) {
        int num1, num2;
        Scanner tc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        num1 = tc.nextInt();
        System.out.println("Numero 2:");
        num2 = tc.nextInt();
        System.out.println("Maior Valor: "+MaiorValor(num1, num2));
    }
}
