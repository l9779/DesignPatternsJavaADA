package behavioral.templatemethod.solucao;

import behavioral.templatemethod.VeiculoParaReparo;

public class TesteReparVeiculosComTemplateMethod {
    public static void main(String[] args) {
        System.out.println("----------------LUXO-----------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparoVeiculoService rpl = new ReparoVeiculoDeLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("----------------COMUM-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparoVeiculoComumServiceComTemplateMethod(veiculoComum);

        rpc.reparaVeiculo();
    }
}
