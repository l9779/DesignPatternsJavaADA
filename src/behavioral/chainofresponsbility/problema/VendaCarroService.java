package behavioral.chainofresponsbility.problema;

import behavioral.chainofresponsbility.Carro;
import behavioral.chainofresponsbility.Marca;

import java.math.BigDecimal;

// Problema: código pode ficar uma bagunça se mais regras de negócios forem adicionadas
public class VendaCarroService {
    public BigDecimal calculaValorVenda(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        // Se carro for FIAT desconto de R$1.000
        if (Marca.FIAT.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000));
        }

        // Se carro for FORD desconto de R$2.000
        if (Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }

        // Se carro custar mais de R$100.000 desconto de R$10.000
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return valorVenda;
    }
}
