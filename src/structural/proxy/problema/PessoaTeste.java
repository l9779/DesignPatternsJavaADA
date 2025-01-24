package structural.proxy.problema;

import creational.builder.Pessoa;
import structural.proxy.PessoaRepository;
import structural.proxy.PessoaService;

import java.time.LocalDate;

// Problema: é necessário adicionar um log para o PessoaRepository, mas não deve modificar a classe original
public class PessoaTeste {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepository());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Piotto")
                .dataNascimento(LocalDate.of(1985, 03, 12))
                .nome("Anderson")
                .apelido("Careca")
                .documento("35461848889")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
    }
}
