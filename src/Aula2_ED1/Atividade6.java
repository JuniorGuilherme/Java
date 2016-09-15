package Aula2_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 16/08/2016.
 */
public class Atividade6 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        class Funcionarios {
            String nome, cargo;
            double salario;
        }
        Funcionarios junior = new Funcionarios();
        System.out.println("Digite seu Nome:");
        junior.nome = tc.nextLine();
        System.out.println("Digite seu Cargo: ");
        junior.cargo = tc.nextLine();
        System.out.println("Digite seu Salário: ");
        junior.salario = tc.nextDouble();

    }
}
