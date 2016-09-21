package Aula4_AP3;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 20/09/2016.
 */
public class Funcionario {
    String nome, departamento;
    int idade;
    double salario;
    Funcionario f[] = new Funcionario[10];
    Scanner tc = new Scanner(System.in);
    public int cadastrar(int cont){
        Funcionario f = new Funcionario();
        System.out.println("Nome:");
        f.nome=tc.nextLine();
        f.nome=tc.nextLine();
        System.out.println("Departamento:");
        f.departamento=tc.nextLine();
        System.out.println("Idade:");
        f.idade=tc.nextInt();
        System.out.println("Salario: ");
        f.salario=tc.nextDouble();
        cont++;
        this.f[cont]=f;
        return cont;
    }
    public void listar(int cont){
        for(int i=0; i<=cont; i++){
            System.out.println("Nome: "+f[i].nome);
            System.out.println("Departamento: "+f[i].departamento);
            System.out.println("Idade: "+f[i].idade);
            System.out.println("Salario: "+f[i].salario);
        }
    }
    public int remover(int cont){
        String remover;
        System.out.println("Funcionario a ser removido:");
        remover=tc.nextLine();
        remover=tc.nextLine();
        Funcionario aux[] = new Funcionario[10];
        int a=-1;
        for(int i=0; i<=cont; i++){
            if(remover.equalsIgnoreCase(f[i].nome)){
                System.out.println("Funcionario removido: "+f[i].nome);
            }
            else{
                a++;
                aux[a]=f[i];
            }
        }
        f=aux;
        cont--;
        return cont;
    }
    public void extremosSalario(int cont){
        double maiorSalario=0, menorSalario;
        String nomeMaior="", nomeMenor="";
        for(int i=0; i<=cont; i++){
            if(f[i].salario>maiorSalario){
                maiorSalario=f[i].salario;
                nomeMaior=f[i].nome;
                nomeMenor=f[i].nome;
            }
        }
        menorSalario=maiorSalario;
        for(int i=0; i<=cont; i++){
            if(f[i].salario<menorSalario){
                menorSalario=f[i].salario;
                nomeMenor=f[i].nome;
            }
        }
        System.out.println("Maior Salario: R$"+maiorSalario);
        System.out.println("Nome: "+nomeMaior);
        System.out.println("");
        System.out.println("Nome: "+nomeMenor);
        System.out.println("Menor Salario: R$"+menorSalario);
    }
    public static void main(String[] args) {
        Funcionario a = new Funcionario();
        int op, cont=-1;
        do{
            System.out.println("1 == Cadastrar | 2 == Listar | 3 == Remover | 4 == Maior e Menor Salario | 5 == Sair");
            op=a.tc.nextInt();
            switch (op){
                case 1:{
                    cont=a.cadastrar(cont);
                }
                break;
                case 2:{
                    if(cont>=0) {
                        a.listar(cont);
                    }
                    else{
                        System.out.println("Nem um funcionario cadastrado.");
                    }
                }
                break;
                case 3:{
                    if(cont>=0) {
                        cont=a.remover(cont);
                    }
                    else{
                        System.out.println("Nem um funcionario cadastrado.");
                    }
                }
                break;
                case 4:{

                    if(cont>=0) {
                        a.extremosSalario(cont);
                    }
                    else{
                        System.out.println("Nem um funcionario cadastrado.");
                    }
                }
                break;
                default:{
                    System.out.println("Opção invalida.");
                }
            }
        }while(op!=5);
    }
}