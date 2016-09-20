package Aula9_AP3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jrg_c on 18/09/2016.
 */
public class Cao {
    String nome, raca;
    int idade;
    char sexo, pedigree, premiacoes;
    Scanner tc = new Scanner(System.in);
    NomeSemelhante ns = new NomeSemelhante();
    Canil canil = new Canil();

    public Cao cadastrar(ArrayList<Cao> x){
        Cao c = new Cao();
        int flag;
        System.out.println("Nome: ");
        do {
            flag=0;
            c.nome = tc.nextLine();
            for(int i=0; i<x.size(); i++){
                if(c.nome.equalsIgnoreCase(x.get(i).nome)){
                    System.out.println("Ja existe um cão com este nome.");
                    flag=1;
                }
            }
        }while(flag==1);
        System.out.println("Idade: ");
        c.idade=canil.validaInt();
        System.out.println("Raça: ");
        c.raca=tc.nextLine();
        System.out.println("Sexo:");
        do {
            c.sexo = tc.next().toUpperCase().charAt(0);
            if(c.sexo != 'M' && c.sexo != 'F'){
                System.out.println("Digite apenas M ou F");
            }
        }while((c.sexo != 'M' && c.sexo != 'F'));
        System.out.println("Pedigree: Sim(S) ou Não(N)");
        do {
            c.pedigree=tc.next().toUpperCase().charAt(0);
            if(c.pedigree != 'S' && c.pedigree != 'N'){
                System.out.println("Digite apenas S ou N");
            }
        }while((c.sexo != 'M' && c.sexo != 'F'));
        System.out.println("Premiações: Sim(S) ou Não(N)");
        do {
            c.premiacoes=tc.next().toUpperCase().charAt(0);
            if(c.premiacoes != 'S' && c.premiacoes != 'N'){
                System.out.println("Digite apenas S ou N");
            }
        }while((c.premiacoes != 'M' && c.premiacoes != 'F'));
        return c;
    }
    public boolean nomeSemelhante(String y, String x){
            if(ns.compareString(y, x)) {
                return true;
            }
            else {
                return false;
        }
    }
    public void listarCao(Cao x){
        System.out.println("Nome: " + x.nome);
        System.out.println("Idade: " + x.idade);
        System.out.println("Raça: " + x.raca);
        System.out.println("Sexo: " + x.sexo);
        System.out.println("Pedigree: " + x.pedigree);
        System.out.println("Premiações: " + x.premiacoes);
        System.out.println("");
    }
}