package behavioral.strategy.solucao;

import behavioral.strategy.Funcionario;
import behavioral.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

// Solução: Cria a interface CalculadorReajusteAnualSalario que vai usar polimorfismo para decidir qual
// estratégia deve ser usada para calcular o reajuste.
// Com esse padrão de desenvolvimento as classes antigas não precisam ter seu código modificado e podem
// ser facilmente expandidas para novas soluções. Open-closed principal do SOLID
public class TesteAjusteSalarioComStrategy {
    public static void main(String[] args) {
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Podolski");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Osvaldo");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(1000));

        Funcionario funcionarioCooperativa = new Funcionario();
        funcionarioCooperativa.setNome("João");
        funcionarioCooperativa.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
        funcionarioCooperativa.setSalario(new BigDecimal(8000));

        // calcular nossos reajustes aqui
        reajusteAnualSalario.calculaRejusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaRejusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaRejusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioESTAGIO());
        reajusteAnualSalario.calculaRejusteAnual(funcionarioCooperativa, new CalculadorReajusteAnualSalarioCOOPERATIVA());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioCooperativa);
    }
}
