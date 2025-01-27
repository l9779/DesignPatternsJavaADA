package behavioral.templatemethod.problema;

import behavioral.templatemethod.VeiculoParaReparo;

// Problema: código repetido nas duas classes ReparoVeiculo
public class TesteReparoVeiculos {
    public static void main(String[] args) {
        System.out.println("----------------LUXO-----------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparoVeiculoDeLuxoService rpl = new ReparoVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("----------------COMUM-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        ReparoVeiculoComumService rpc = new ReparoVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
