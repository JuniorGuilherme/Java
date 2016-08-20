package ed3;

import java.util.Scanner;

/**
 * Created by jrg_c on 16/08/2016.
 */
public class Atividade7 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int op=0, qtd=0, flag=1, ano;
        double preco;
        String marca, cor;
        class Carro{
            String marca, cor;
            int ano;
            double preco;
        }
        Carro vetcarros[]= new Carro[3];
        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Incluir Carro");
            System.out.println("2- Pesquisar por Preço");
            System.out.println("3- Pesquisar por Marca");
            System.out.println("4- Pesquisar Carro");
            op=tc.nextInt();
            switch (op){
                case 1:
                    do{
                    Carro c= new Carro();
                        System.out.println("Carro ["+qtd+"]:");
                        System.out.println("Digite a marca:");
                        c.marca=tc.next();
                        System.out.println("Digite a cor");
                        c.cor=tc.next();
                        c.cor=tc.nextLine();
                        System.out.println("Digite o ano: ");
                        c.ano=tc.nextInt();
                        System.out.println("Digite o preco: ");
                        c.preco=tc.nextDouble();
                        vetcarros[qtd]=c;
                        qtd++;
                        System.out.println("Deseja incluir outro carro? 1- Sim 2- Nao");
                        op=tc.nextInt();
                    }while(op==1);
                    break;
                case 2:
                    System.out.println("Digite um Preço: ");
                    preco=tc.nextDouble();
                    for(int i=0; i<qtd; i++) {
                        if (preco <= vetcarros[i].preco) {
                            System.out.println("Marca: " + vetcarros[i].marca);
                            System.out.println("Cor: " + vetcarros[i].cor);
                            System.out.println("Ano: " + vetcarros[i].ano);
                            System.out.println("");
                            flag=0;
                        }
                    }
                    if(flag!=0){
                        System.out.println("Nenhum carro encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite a Marca:");
                    marca=tc.nextLine();
                    for(int i=0; i<qtd; i++){
                        if(marca.equals(vetcarros[i].marca)){
                            System.out.println("Preço: "+vetcarros[i].preco);
                            System.out.println("Ano: "+vetcarros[i].ano);
                            System.out.println("Cor:"+vetcarros[i].cor);
                            flag=2;
                        }
                        if(flag!=2){
                            System.out.println("Nenhum carro encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite a marca:");
                    marca=tc.nextLine();
                    System.out.println("Digite a cor: ");
                    cor=tc.nextLine();
                    System.out.println("Digite o ano: ");
                    ano=tc.nextInt();
                    for(int i=0; i<qtd; i++){
                        if(marca.equals(vetcarros[i].marca)&& cor.equals(vetcarros[i].cor) && ano==vetcarros[i].ano){
                            System.out.println("Preço do Carro["+i+"]: "+vetcarros[i].preco);
                            flag=3;
                        }
                    }
                    if(flag!=3){
                        System.out.println("Nenhum carro encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
            }
        }while(op!=5 || qtd<20);
    }
}