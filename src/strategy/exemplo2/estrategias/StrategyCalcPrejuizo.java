package org.designpatterns.strategy.exemplo2.estrategias;

public class StrategyCalcPrejuizo implements StrategyCalculo{
    private final double PREJU = 50;

    @Override
    public double calcularLucro(double preco) {
        return preco - PREJU;
    }
}
