package Aula1_ED1;

public class Principal {

    public static void main(String[] args) {

        //Exercicio 1:
        int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gasto Trimestral: " + gastosTrimestre);
        float mediaMensal;
        mediaMensal = gastosTrimestre / 3;
        System.out.println("Valor da media mensal: " + mediaMensal);
        //Exercicio 3:
        int num = 150, soma = 0;
        while (num < 300) {
            System.out.println(num);
            num++;
        }
        //Exercicio 4:
        num = 1;
        while (num <= 1000) {
            soma = soma + num;
            num++;
        }
        System.out.println("Soma de 1 até 1000: " + soma);
        //Exercicio 5:
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Multiplo de 3: " + i);
            }
        }
        //Outra Abordagem
        int i = 0;
        while (i < 100) {
            System.out.println("Múltiplo de 3: " + i);
            i = i + 3;
        }
    }

}