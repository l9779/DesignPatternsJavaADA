package behavioral.chainofresponsbility.solucao;

import behavioral.chainofresponsbility.Carro;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro {
    public SemDireitoADesconto(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
