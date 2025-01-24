package structural.proxy.solucao;

import creational.builder.Pessoa;

// interface com abstrata para fazer a interdependência entre as classe service e repository
public interface ProxyPessoa {
    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
