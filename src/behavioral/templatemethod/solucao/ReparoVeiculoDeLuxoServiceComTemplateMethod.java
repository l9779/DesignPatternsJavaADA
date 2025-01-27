package behavioral.templatemethod.solucao;

import behavioral.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoDeLuxoServiceComTemplateMethod extends ReparoVeiculoService{
    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoDeLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo){

        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
