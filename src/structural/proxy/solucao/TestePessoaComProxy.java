package structural.proxy.solucao;

import creational.builder.Pessoa;

import java.time.LocalDate;

// O programa funciona como anteriormente, só que agora com um logger implementado através do proxy
public class TestePessoaComProxy {
    public static void main(String[] args) {
        PessoaServiceComProxy pessoaServiceComProxy = new PessoaServiceComProxy(new PessoaRepositoryProxy());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Piotto")
                .dataNascimento(LocalDate.of(1985, 03, 12))
                .nome("Anderson")
                .apelido("Careca")
                .documento("35461848889")
                .build();

        pessoaServiceComProxy.save(pessoa);

        Pessoa pessoaRetornada = pessoaServiceComProxy.findById(1L);
        System.out.println(pessoaRetornada);
    }

}
