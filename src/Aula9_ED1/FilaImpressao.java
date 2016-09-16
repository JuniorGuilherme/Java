package Aula9_ED1;

import Aula8_ED1.Fila;

import java.util.Scanner;

/**
 * Created by jrg_c on 14/09/2016.
 */
public class FilaImpressao {
    Scanner tc = new Scanner(System.in);
    Trabalho t = new Trabalho();
    int cont;
    public void init(){
        Fila f[] = new Fila[10];
        cont=-1;
    }
    public void cadastro(){
        System.out.println("Nome do Cliente: ");
        t.nome=tc.next();
        System.out.println("Numero do Pedido:");
        t.npedido=tc.nextInt();
        System.out.println("Quantidade de Cópias:");
        t.qtd=tc.nextInt();
        System.out.println("Previsão de Intrega:");
        t.data=tc.next();
    }
}
