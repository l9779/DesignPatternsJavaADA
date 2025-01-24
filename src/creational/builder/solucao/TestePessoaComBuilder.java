package creational.builder.solucao;

import creational.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {
//    Solução: criar builder que permite você tem maior controle sobre todos os parâmetros necessários
//    para a criação da classe

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder().
                nome("Lucas").
                sobreNome("Batista").
                apelido("Coiso").
                dataNascimento(LocalDate.of(1997,9,17)).
                documento("14785266").
                email("lucas@email.com").
                build();

        System.out.println(pessoa);
    }
}
