package Aula6_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 30/08/2016.
 */
public class PilhaRamon {
    public Object[] pilha = new Object[10];
    public int topo;
    public Scanner tc = new Scanner(System.in);

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

    public char valida() {
        char n;
        do {
            System.out.println("Digite S ou N: ");
            n = tc.next().toUpperCase().charAt(0);
        }
        while (n != 'N' && n != 'S');
        return n;
    }

    public static void main(String[] args) {
        PilhaRamon minhaPilha = new PilhaRamon();
        Object ob, ob2;
        Scanner tc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("Digite a ação desejada:");
            System.out.println("");
            System.out.println("1- Inicializar Pilha");
            System.out.println("2- Push");
            System.out.println("3- Exibir");
            System.out.println("4- Pop");
            System.out.println("5- Top");
            System.out.println("6- isEmpty");
            System.out.println("7- isFull");
            System.out.println("8- Pull");
            System.out.println("9- Sair ");
            op = tc.nextInt();
            switch (op) {
                case 1:
                    minhaPilha.isInit();
                    break;
                case 2:
                    do {
                        System.out.println("Digite algo:");
                        ob = tc.next();
                        minhaPilha.push(ob);
                        System.out.println("Deseja adicionar outro elemento?");
                    } while (minhaPilha.valida() == 's');
                    break;
                case 3:
                    minhaPilha.exibir();
                    break;
                case 4:
                    if (minhaPilha.pop())
                        System.out.println("Elemento desempilhado.");
                    else
                        System.out.println("Pilha ainda vazia.");
                    break;
                case 5:
                    minhaPilha.top();
                    break;
                case 6:
                    if (minhaPilha.isEmpty())
                        System.out.println("Pilha esta vazia.");
                    else
                        System.out.println("Pilha contem elementos.");
                    break;
                case 7:
                    if (minhaPilha.isFull())
                        System.out.println("Pilha esta cheia.");
                    else
                        System.out.println("Pilha ainda possui vagas.");
                    break;
                case 8:
                    minhaPilha.pull();
                    break;
                case 9:
                    System.out.println("Pilha encerrada.");
            }
        } while (op != 9);
    }
}

