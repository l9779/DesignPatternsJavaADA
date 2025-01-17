package factorymethods.problema;

import factorymethods.ProdutoDigital;
import factorymethods.ProdutoFisico;

import java.math.BigDecimal;

// O atributo 'PossuiDimensoesFisicas' depende de que classe ele herda, desse modo fica suscetível
// a erro do programador
public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(BigDecimal.valueOf(100));
        produtoFisico.setDescricao("é físico");
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPreco(BigDecimal.valueOf(50));
        produtoDigital.setDescricao("é digital");
        produtoDigital.setPossuiDimensoesFisicas(false);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);
    }
}
