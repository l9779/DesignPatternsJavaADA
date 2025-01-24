package structural.proxy.solucao;

import creational.builder.Pessoa;
import structural.proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

// Cria um proxy da classe, que é uma sub-classe do original, e adicionar um logger nessa classe
public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        super.save(pessoa);
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do findById...");
        long inicio = System.currentTimeMillis();

        Pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))){
            log.info("Esta pegando do cache ");
            pessoa = cache.get(id);
        } else {
            log.info("Esta pegando do PessoaRepository ");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }

        log.info("Chamada do metodo findById finalizada.");
        long fim = System.currentTimeMillis();

        log.info("Tempo gasto na chamada... " + (fim - inicio));
        return super.findById(id);
    }
}
