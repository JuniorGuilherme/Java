package ed5;

import java.util.Scanner;

/**
 * Created by jrg_c on 23/08/2016.
 */
public class Atividade5 {
    public static void main(String[] args) {
        int num;
        int num2;
        Scanner tc = new Scanner(System.in);
        do{
            System.out.println("Numero 1: ");
            num=tc.nextInt();
            num2=tc.nextInt();
            if(num%2!=0 || num2%2==0){
                System.out.println("O primeiro deve ser par e o ultimo impar.");
            }
        }while(num%2!=0 || num2%2==0);
        System.out.println("Soma:"+Soma(num, num2));
    }
    public static int Soma (int n1, int n2){
        int soma = n1+n2;
        return(soma);
    }
}
