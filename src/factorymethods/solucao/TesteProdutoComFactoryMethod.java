package factorymethods.solucao;

import factorymethods.Produto;
import factorymethods.TipoProdutoEnum;

import java.math.BigDecimal;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        System.out.println(produtoDigital);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        System.out.println(produtoFisico);
    }
}
