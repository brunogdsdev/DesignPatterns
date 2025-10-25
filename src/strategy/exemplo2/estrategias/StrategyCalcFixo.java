package org.designpatterns.strategy.exemplo2.estrategias;

public class StrategyCalcFixo implements StrategyCalculo{
    private final double LUCRO_FIXO = 10;
    @Override
    public double calcularLucro(double preco) {
        return preco + LUCRO_FIXO;
    }
}
