package Aula2_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 09/08/2016.
 */

public class Endereco {
    String rua;
    int num;
    String cep;

    void exibirEndereco() {
        System.out.println(".............");
        System.out.println(rua);
        System.out.println(num);
        System.out.println(cep);
    }

    void lerEnd() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua Rua: ");
        rua = teclado.next();
        System.out.println("Digite o numero");
        num = teclado.nextInt();
        System.out.println("Digite o Cep:");
        cep = teclado.next();
    }
}
