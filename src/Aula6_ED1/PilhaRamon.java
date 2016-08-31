package Aula6_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 30/08/2016.
 */
public class PilhaRamon {
    public Object[] pilha = new Object[10];
    public int topo;

    public void isInit(){
        System.out.println("Pilha Inicializada");
        this.topo=-1;
    }
    public void push(Object valor){
        this.topo++;
        this.pilha[this.topo]=valor;
        System.out.println("Elemento adicionado.");
    }
    public void exibir(){
        for(int i=0; i<=this.topo;i++){
            System.out.println("Elemento "+i+": "+this.pilha[i]);
        }
    }
    public boolean pop(){
        if(this.topo==-1)
            return false;
        else
            this.topo--;
            return true;
    }
    public void top(){
        System.out.println("Topo: "+this.pilha[this.topo]);
    }
    public void pull(){
        Scanner tc = new Scanner(System.in);
        if(this.topo>-1) {
            System.out.println("Alteração do Topo: ");
            this.pilha[this.topo] = tc.next();
        }
        else
            System.out.println("Pilha vazia.");
    }
    public boolean isEmpty(){
        if(this.topo==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(this.topo==10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PilhaRamon minhaPilha = new PilhaRamon();
        Object ob, ob2;
        Scanner tc = new Scanner(System.in);

        minhaPilha.isInit();
        System.out.println("Digite algo:");
        ob=tc.next();
        minhaPilha.push(ob);

        System.out.println("Digite algo:");
        ob2=tc.next();
        minhaPilha.push(ob2);

        minhaPilha.exibir();

        System.out.println("Desempilhando..");
        if(minhaPilha.pop())
            System.out.println("Elemento desempilhado.");
        else
            System.out.println("Pilha ainda vazia.");

        minhaPilha.top();

        minhaPilha.pull();

        if(minhaPilha.isEmpty())
            System.out.println("Pilha esta vazia.");
        else
            System.out.println("Pilha contem elementos.");
        if(minhaPilha.isFull())
            System.out.println("Pilha esta cheia.");
        else
            System.out.println("Pilha ainda possui vagas.");
    }
}

