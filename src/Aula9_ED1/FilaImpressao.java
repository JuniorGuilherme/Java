package Aula9_ED1;

import Aula8_ED1.Fila;

import java.util.Scanner;

/**
 * Created by jrg_c on 14/09/2016.
 */
public class FilaImpressao {
    Scanner tc = new Scanner(System.in);
    int cont;
    FilaEntrega e = new FilaEntrega();
    Trabalho f[];
    public void init(){
        f = new Trabalho[10];
        this.cont=-1;
        e.init();
    }
    public void cadastro(){
        Trabalho t = new Trabalho();
        System.out.println("Nome do Cliente: ");
        t.nome=tc.next();
        System.out.println("Numero do Pedido:");
        t.npedido=tc.nextInt();
        System.out.println("Quantidade de Cópias:");
        t.qtd=tc.nextInt();
        System.out.println("Previsão de Intrega:");
        t.data=tc.next();
        this.cont++;
        f[this.cont]=t;
        System.out.println("Trabalho adicionado com sucesso.");
    }
    public Trabalho imprimir(){
        Trabalho aux = f[0];
        Trabalho auxF[] = new Trabalho[this.cont];
        for(int i=1; i<=this.cont; i++){
            auxF[i-1]=f[i];
        }
        f=auxF;
        this.cont--;
        return aux;
    }
    public boolean isFull(){
        if(this.cont==f.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(this.cont==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void isFirst(){
        System.out.println("Proximo a ser impresso:");
        System.out.println("Nome: "+f[0].nome);
        System.out.println("Pedido: "+f[0].npedido);
        System.out.println("Quantidade: "+f[0].qtd);
        System.out.println("Previsao Entrega: "+f[0].data);
    }
}
