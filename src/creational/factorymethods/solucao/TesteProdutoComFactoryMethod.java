package creational.factorymethods.solucao;

import creational.factorymethods.Produto;
import creational.factorymethods.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        System.out.println(produtoDigital);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        System.out.println(produtoFisico);
    }
}
