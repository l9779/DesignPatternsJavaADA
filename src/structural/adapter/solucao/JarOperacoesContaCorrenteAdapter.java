package structural.adapter.solucao;

import structural.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

// Adapter da classe com métodos inseguros, aqui a ordem dos métodos vão ser reinscritas tornar o programa
// mais seguro
public class JarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrente jarCC; // Objeto da classe original

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarCC) {
        this.jarCC = jarCC;
    }

    // Método saca refatorado para tornar mais seguro
    public void saca(BigDecimal valorPretendido){
        if(jarCC.validaSaldo(valorPretendido)) {
            jarCC.saca(valorPretendido);
        } else {
            throw new IllegalArgumentException("Valor para saque não permitido");
        }
    }

    public void deposita(BigDecimal valor){
        jarCC.deposita(valor);
    }
}
