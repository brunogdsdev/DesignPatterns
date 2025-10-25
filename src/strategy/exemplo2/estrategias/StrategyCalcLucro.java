package org.designpatterns.strategy.exemplo2.estrategias;

public class StrategyCalcLucro implements StrategyCalculo{
    private final int LUCRO  = 2;
    @Override
    public double calcularLucro(double preco) {
        return preco * LUCRO;
    }
}
