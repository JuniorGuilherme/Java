package Aula7_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 06/09/2016.
 * Considere que um estacionamento da Rua Direita, em uma cidade, é composto por uma única alameda que guarda até dez carros.
 * Existe apenas uma entrada/saída no estacionamento, e esta na extremidade da alameda de acesso justamente à Rua Direita.
 * Se chegar um cliente para retirar um carro que não seja o mais próximo da saída, todos os carros bloqueando seu caminho
 * sairão do estacionamento. O carro do cliente será manobrado para fora do estacionamento, e os outros carros voltarão a
 * ocupar a mesma sequencia inicial.

 Escreva um programa que processe um grupo de linhas de entrada. Cada linha de entrada contém um ‘E’, de entrada, ou um ‘S’ de saída,
 e o número da placa do carro. Presume-se que os carros cheguem e partam na mesma ordem que entraram no estacionamento.
 O programa deve imprimir uma mensagem sempre que um carro chegar ou sair. Quando um carro chegar,
 a mensagem deve especificar se existe ou não vaga para o carro no estacionamento. Se naco houver vaga,
 o carro partirá sem entrar no estacionamento. Quando um carro sair do estacionamento, a mensagem deverá incluir o número de vezes
 em que o carro foi manobrado para fora do estacionamento para permitir que os outros carros saíssem.

 */
public class Principal {
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
        Scanner tc = new Scanner(System.in);
        int op;
        boolean repeat;
        Estacionamento estac = new Estacionamento();
        Rua rua = new Rua();
        estac.isInit();
        rua.isInit();
        do{
            System.out.println("Escolha uma ação:");
            System.out.println("");
            System.out.println("1- Entrar Carro");
            System.out.println("2- Sair Carro");
            System.out.println("3- Ver carros do estacionamento.");
            System.out.println("4- Topo Estacionamento");
            System.out.println("5- Sair do Programa");
            do {
                op =tc.nextInt();
                if(op<1||op>5){
                    System.out.println("Opção incorreta, tente novamente.");
                }
            }while(op<1||op>5);
            switch(op){
                case 1: {
                    if (estac.isFull())
                        System.out.println("Não há mais vagas.");
                    else {
                        do {
                            repeat = false;
                            Car c = new Car();
                            System.out.println("Placa: ");
                            c.placa = tc.next();
                            estac.push(c);
                            if (estac.isFull() == false) {
                                System.out.println("");
                                System.out.println("Deseja estacionar um novo veiculo?");
                                repeat = valida();
                            } else
                                System.out.println("Não ha mais vagas.");
                        } while (repeat == true && estac.isFull() == false);
                    }
                    break;
                }
                case 2: {
                    int sairCar, cont = 0;
                    if (estac.isEmpty() == false) {
                        do {
                            System.out.println("Qual carro deseja retirar? Entre com o numero do carro. ");
                            System.out.println("");
                            if (estac.isEmpty()) {
                                System.out.println("Estacionamento vazio.");
                            } else {
                                estac.exibir();
                            }
                            sairCar = tc.nextInt();
                            if (sairCar > estac.topo || sairCar < 0)
                                System.out.println("Este carro não esta estacionado.");
                        } while (sairCar > estac.topo || sairCar < 0);
                        for (int i = estac.topo; i >= sairCar; i--) {
                            if (estac.topo == sairCar) {
                                estac.pop();
                                System.out.println("");
                                System.out.println("Saiu definitivo:");
                                System.out.println("Carro[" + i + "]: " + estac.est[i].placa);
                                System.out.println("Manobras: " + estac.est[i].manobra);
                            } else {
                                Car c;
                                c = estac.est[i];
                                rua.push(c);
                                cont++;
                                if (estac.pop())
                                    System.out.println("Saiu para Rua Carro[" + i + "]: " + estac.est[i].placa);
                                else
                                    System.out.println("Estacionamento vazio.");
                            }
                        }
                        for (int i = cont - 1; i >= 0; i--) {
                            Car c;
                            rua.rua[i].manobra++;
                            c = rua.rua[i];
                            rua.pop();
                            estac.push(c);
                        }
                    } else {
                        System.out.println("Não há carros no estacionamento.");
                    }
                    break;
                }
                case 3: {
                    if (estac.isEmpty()) {
                        System.out.println("Estacionamento vazio.");
                    } else {
                        estac.exibir();
                    }
                    break;
                }
                case 4: {
                    estac.top();
                    break;
                }
                case 6: {
                    System.out.println("Programa encerrado.");
                    break;
                }
            }
        }while(op!=5);
    }
}