package structural.proxy.solucao;

import creational.builder.Pessoa;

// Em vez dessa classe ter a classe PessoaRespository como atributo, ela tem o ProxyPessoa, quem vem com o logger
public class PessoaServiceComProxy {
    private ProxyPessoa proxyPessoa;

    public PessoaServiceComProxy(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa){
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id){

        return proxyPessoa.findById(id);
    }
}
