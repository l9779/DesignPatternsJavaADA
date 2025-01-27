package behavioral.templatemethod.solucao;

import behavioral.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService{
    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo){

        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
