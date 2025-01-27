package behavioral.strategy.problema;

import behavioral.strategy.Funcionario;
import behavioral.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

// Problema: com novas regras de negócio, podem surgir novos tipos de contratos. Se um novo contrato
// for adicionado, o código dessa classe precisa ser modificado, isso pode quebrar código e gerar
// novos problemas se isso fosse uma classe complexa.
public class ReajusteAnualSalario {
    public void calculaRejusteAnual(Funcionario funcionario){

        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));

        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));

        } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));

        }
    }
}
