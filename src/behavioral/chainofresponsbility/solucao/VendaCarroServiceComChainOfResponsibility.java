package behavioral.chainofresponsbility.solucao;

import behavioral.chainofresponsbility.Carro;

import java.math.BigDecimal;

// Solução: ChainfOfResponsibility - cria uma cadeia de objetos da classe DescontoCarro e aplica o desconto
// conforme os atributos do objeto Carro.
public class VendaCarroServiceComChainOfResponsibility {
    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto =
                new DescontoCarroFIAT(
                        new DescontoCarroFORD(
                                new DescontoCarroValorMaiorQueCemMil(
                                        new SemDireitoADesconto(null))));

        return desconto.aplicaDesconto(carro);
    }
}
