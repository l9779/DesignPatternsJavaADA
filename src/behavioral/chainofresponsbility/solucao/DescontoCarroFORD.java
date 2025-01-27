package behavioral.chainofresponsbility.solucao;

import behavioral.chainofresponsbility.Carro;
import behavioral.chainofresponsbility.Marca;

import java.math.BigDecimal;

public class DescontoCarroFORD extends DescontoCarro {
    public DescontoCarroFORD(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
