package Aula8_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 13/09/2016.
 */
public class Principal {
    public static boolean valida() {
        Scanner tc = new Scanner(System.in);
        char n;
        do {
            System.out.println("Digite S ou N: ");
            n = tc.next().toUpperCase().charAt(0);
        }
        while (n != 'N' && n != 'S');
        if (n == 'S')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Fila f = new Fila();
        Scanner tc = new Scanner(System.in);
        int op, t;
        do {
            System.out.println("Entre com tamanho da fila:");
            t = tc.nextInt();
        } while (t < 1);
        f.init(t);
        do {
            System.out.println("1- Adicionar elementos.");
            System.out.println("2- Remover elementos");
            System.out.println("3- Mostrar elementos");
            System.out.println("4- Sair do Programa");
            do {
                op = tc.nextInt();
                if (op < 1 || op > 4) {
                    System.out.println("Opção invalida, tente novamente.");
                }
            } while (op < 1 || op > 4);
            switch (op) {
                case 1: {
                    if (!f.isFull()) {
                        do {
                            f.add();
                            if (f.isFull()) {
                                System.out.println("Vetor Cheio.");
                            }
                        } while (!f.isFull());
                    } else {
                        System.out.println("Vetor Cheio.");
                    }
                    break;
                }
                case 2: {
                    f.remove();
                }
                break;
                case 3: {
                    f.show();
                }
                break;
                case 4: {
                    System.out.println("Programa Encerrado.");
                }
                break;
            }
        } while (op != 4);
    }
}
