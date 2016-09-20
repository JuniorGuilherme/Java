package Aula9_AP3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jrg_c on 18/09/2016.
 */
public class Canil {
    public static boolean valida() {
        Scanner tc = new Scanner(System.in);
        char n;
        do {
            System.out.println("Digite S ou N: ");
            n = tc.next().toUpperCase().charAt(0);
        }
        while(n!='N' && n!='S');
        if(n=='S')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner tc =  new Scanner(System.in);
        int op=0;
        ArrayList<Cao> c = new ArrayList<>();
        Cao dog = new Cao();
        do{
            System.out.println("1 == Cadastrar Cães | 2 == Remover Cão | 3 == Listar Caes");
            op=tc.nextInt();
            String pesquisa;
            switch (op){
                case 1:{
                    c.add(dog.cadastrar());
                }
                break;
                case 3:{
                    if(!c.isEmpty()) {
                        do {
                            System.out.println("1 == Nome Semelhante | 2 == Nome Exato | 3 == Por Pedigree | 4 == Sair");
                            op = tc.nextInt();
                            switch (op) {
                                case 1: {
                                    System.out.println("Digite sua Busca:");
                                    pesquisa = tc.next();
                                    dog.listarNS(pesquisa, c);
                                }
                                break;
                                case 2: {
                                    System.out.println("Digite sua Busca");
                                    pesquisa = tc.next();
                                    dog.listarNE(pesquisa, c);
                                }
                                break;
                                case 3: {
                                    System.out.println("Com Pedigree(S de Sim) ou Sem Pedigree(N de Não)");
                                    if (valida()) {
                                        dog.listarPedigree('s', c);
                                    } else {
                                        dog.listarPedigree('n', c);
                                    }
                                }
                                break;
                                default: {
                                    System.out.println("Opção Invalida.");
                                }
                            }
                        } while (op != 4);
                    }
                    else{
                        System.out.println("Nenhum latido no canil ainda.");
                    }
                }
                break;
                default:{
                    System.out.println("Opção invalida. Tente novamente.");
                }
            }
        }while(op!=5);
    }
}
