package Aula6_ED1;

import com.sun.org.apache.xml.internal.security.Init;

/**
 * Created by jrg_c on 30/08/2016.
 */
public class Pilha {
    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        System.out.println("Pilha inicializada.");
        this.posicaoPilha = -1;
        this.pilha = new Object[5];
    }

    public boolean pilhaVazia() {
        if (posicaoPilha == -1)
            return true;
        return false;
    }

    public int tamanhoPilha() {
        if (pilhaVazia())
            return 0;
        return posicaoPilha + 1;
    }

    public Object topoPilha() {
        if (pilhaVazia())
            return null;
        return pilha[posicaoPilha];
    }

    public Object desempilhar() {
        if (pilhaVazia())
            return null;
        return pilha[posicaoPilha--];
    }

    public void empilhar(Object valor) {
        if (posicaoPilha < pilha.length - 1)
            pilha[++posicaoPilha] = valor;
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
        // p.empilhar(200);
        //p.empilhar(5);
        //p.empilhar(70);
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
        System.out.println(p.topoPilha());
    }
}
