package creational.prototype.problema;

import creational.prototype.Botao;
import creational.prototype.TipoBordaEnum;

// Problema: toda vez que você quer criar um novo tipo de botão é necessário criar uma nova classe
public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);

    }
}
