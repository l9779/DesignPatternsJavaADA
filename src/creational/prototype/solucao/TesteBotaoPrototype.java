package creational.prototype.solucao;

import creational.prototype.Botao;
import creational.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        Botao botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO_AMARELO");
        botaoAmarelo.setLargura(200); // modifica um botão sem modificar as configurações iniciais dos outros
        System.out.println(botaoAmarelo);
        System.out.println(botaoAmarelo2);

        // Cria novo tipo de botão
        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(50);
        botaoPreto.setLargura(300);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);
        // Adiciona novo tipo de botão para o REGISTRY
        BotaoRegistry.addRegistry(chave, botaoPreto);

        // Cria novo botão com as novas configurações criadas
        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }
}
