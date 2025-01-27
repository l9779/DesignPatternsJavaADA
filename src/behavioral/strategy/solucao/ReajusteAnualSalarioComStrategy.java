package behavioral.strategy.solucao;

import behavioral.strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {
    // Recebe o funcionário e a estratégia qual deve ser calculado o aumento do salário.
    public void calculaRejusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
        calculador.calcularReajusteAnual(funcionario);
    }
}
