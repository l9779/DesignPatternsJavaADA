package behavioral.chainofresponsbility.solucao;

import behavioral.chainofresponsbility.Carro;

import java.math.BigDecimal;

// classe abstrata que recebe um objeto da mesma classe no construtor em cadeira para determinar qual
// desconto deve ser aplicado.
public abstract class DescontoCarro {
    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesconto(Carro carro);
}
