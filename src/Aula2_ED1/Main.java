package Aula2_ED1;

/**
 * Created by jrg_c on 09/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        end.cep = "88970-000";
        end.num = 492;
        end.rua = "Estrada Geral";
        end.exibirEndereco();

        Pessoa pes = new Pessoa();
        pes.nome = "Junior Guilherme";
        pes.idade = 19;
        pes.exibirPessoa();
    }
}
