package creational.prototype.solucao;

import creational.prototype.Botao;

// classe factory para criar diversos tipos de botão conforme os parâmetros(protótipo) recebidos
public class BotaoFactory {
    public static Botao getInstance(Botao prototipo) {
        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());
        return clone;
    }
}
