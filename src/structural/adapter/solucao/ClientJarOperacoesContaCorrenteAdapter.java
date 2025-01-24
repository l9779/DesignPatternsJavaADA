package structural.adapter.solucao;

import structural.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

// Adapter da classe com utilizando agora o Adapter da classe JarCC, tornar o programa mais seguro
public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaAdapter) {
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca(BigDecimal valorPretendido){

        jarContaAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor){

        jarContaAdapter.deposita(valor);
    }
}
