package ap3;

/**
 * Created by jrg_c on 22/08/2016.
 */
public class TestaAluno {
    public static void main(String[] args) {
        Aluno alunoA = new Aluno();
        Aluno alunoB = new Aluno();

        alunoA.nome = "Junior";
        alunoA.cpf = "09515153";
        alunoA.nasc = "16/09/2016";

        alunoB.nome = "Sibeli";
        alunoB.cpf = "09895153";
        alunoB.nasc = "02/09/1996";

        System.out.println("Nome Aluno A:"+alunoA.nome);

    }
}
