package Aula2_ED1;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 20/08/2016.
 */
public class Atividade8 {
    public static void main(String[] args) {
        class Produto {
            String nome;
            char setor;
            int qtd;
            double preco;
        }
        Scanner tc = new Scanner(System.in);
        int op, qtd = 0;
        char setor;
        double soma = 0;
        Produto estoque[] = new Produto[100];
        do {
            int flag = 0;
            System.out.println("");
            System.out.println("Digite a opcao desejada:");
            System.out.println("1- Inserir Produtos");
            System.out.println("2- Produtos por Setor");
            System.out.println("3- Capital Investido");
            System.out.println("4- Sair");
            op = tc.nextInt();
            while (op < 1 || op > 4) {
                System.out.println("Digite apenas as opcoes oferecidas (1 a 4): ");
                op = tc.nextInt();
            }
            switch (op) {
                case 1:
                    Produto p = new Produto();
                    System.out.println("Nome do Produto:");
                    p.nome = tc.next();
                    System.out.println("Setor do Produto:");
                    p.setor = tc.next().charAt(0);
                    System.out.println("Quantidade do Produto:");
                    p.qtd = tc.nextInt();
                    System.out.println("Valor do Produto:");
                    p.preco = tc.nextDouble();
                    estoque[qtd] = p;
                    qtd++;
                    break;
                case 2:
                    System.out.println("Digite o Setor: ");
                    setor = tc.next().charAt(0);
                    System.out.println("Produtos encontrados:");
                    for (int i = 0; i < qtd; i++) {
                        if (estoque[i].setor == setor) {
                            System.out.println("Nome do Produto[" + (i + 1) + "]: " + estoque[i].nome);
                            flag = 1;
                        }
                    }
                    if (flag != 1) {
                        System.out.println("Nenhum produto encontrado.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < qtd; i++) {
                        soma += estoque[i].qtd * estoque[i].preco;
                    }
                    System.out.println("Capital Investido: R$" + soma);
                    break;
                case 4:
                    System.out.println("Programa Encerrado.");
                    break;
            }
        } while (op != 4);
    }
}
