package structural.adapter.solucao;


import structural.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

// Solução: Cria um Adapter das classes do jar mal-inscritas que refatora a ordem dos métodos e torna o
// código mais seguro
public class TesteOperacoesContaCorrenteAdapter {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente(); // objeto da classe original, para ser usado do construtor do Adapter
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta); // Adapter do JarCC que vai ser usado no construtor do Adapter Client
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

//        código simplificado e mais seguro graças aos adapters
        BigDecimal valorPretendidoParaSaque = new BigDecimal(100000);
        client.saca(valorPretendidoParaSaque); // 1° chamada
        client.deposita(new BigDecimal(500)); // 2° chamada
    }
}
