package creational.prototype.solucao;

import creational.prototype.Botao;
import creational.prototype.TipoBordaEnum;

import java.util.HashMap;

public class BotaoRegistry {
    private static HashMap<String, Botao> REGISTRY = new HashMap<>();

    // bloco estático chamado quando a classe é criada
    // Popula o REGISTRY com todas as configurações diferentes de botões
    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    // retorna objeto da classe Botão conforme a chave
    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    // Adiciona novas configurações de botões para REGISTRY
    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}
