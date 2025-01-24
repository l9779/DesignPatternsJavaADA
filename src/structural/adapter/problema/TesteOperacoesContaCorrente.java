package structural.adapter.problema;

import java.math.BigDecimal;

// Problema: a JAR é mal-inscrita, o próprio desenvolvedor tem que escrever um bloco de condições para
// poder chamar os métodos sem problemas.
public class TesteOperacoesContaCorrente {
    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(100000);

        if(client.validaSaldo(valorPretendidoParaSaque)){ // 1° chamada
            client.saca(valorPretendidoParaSaque); // 2° chamada
        }

        client.deposita(new BigDecimal(500)); // 3 / chamada
    }
}
