package creational.factorymethods.solucao;

import creational.factorymethods.Produto;
import creational.factorymethods.ProdutoDigital;
import creational.factorymethods.ProdutoFisico;
import creational.factorymethods.TipoProdutoEnum;

import java.math.BigDecimal;

/*
* Criador de objeto com método estático que
* Retorna uma instância do objeto com atributo que pode variar conforme o parâmetro
* O factory method encapsula a construção de objetos e aplica regra de negócios a partir da criação do objeto
* */
public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                produtoFisico.setDescricao("é físico.");
                produtoFisico.setPreco(BigDecimal.ONE);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                produtoDigital.setDescricao("é digital.");
                produtoDigital.setPreco(BigDecimal.ONE);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto não disponível.");
        }
    }
}
