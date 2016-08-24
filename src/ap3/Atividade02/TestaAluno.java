package ap3.Atividade02;

/**
 * Created by jrg_c on 22/08/2016.
 */
public class TestaAluno {
    public static void main(String[] args) {
        Aluno alunoA = new Aluno();
        Aluno alunoB = new Aluno();

        alunoA.nome = "Junior";
        alunoA.cpf = "09515153905";
        alunoA.nasc = "16/09/2016";

        alunoB.nome = "Sibeli";
        alunoB.cpf = "09278453897";
        alunoB.nasc = "02/09/1996";

        System.out.println("Nome do Aluno A: "+alunoA.nome);
        System.out.println("CPF do Aluno A: "+alunoA.cpf);
        System.out.println("Data de Nascimento do Aluno A: "+alunoA.nasc);
        System.out.println("Nome Aluno B: "+alunoB.nome);
        System.out.println("CPF do Aluno B: "+alunoB.cpf);
        System.out.println("Data de Nascimento do Aluno B: "+alunoB.nasc);
    }
}