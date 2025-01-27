package behavioral.strategy.solucao;

import behavioral.strategy.Funcionario;

// Essa interface permite que qualquer classe que herde dela seja utilizada como parâmetro na chamada de
// ReajusteAnualSalarioComStrategy
public interface CalculadorReajusteAnualSalario {
    void calcularReajusteAnual(Funcionario funcionario);
}
