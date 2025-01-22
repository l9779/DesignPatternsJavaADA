package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

// Problema: toda vez que você quer criar um novo tipo de botão é necessário criar uma nova classe
public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);

    }
}
