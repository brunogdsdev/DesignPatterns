package org.designpatterns.factorymethod;

import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalcFixo;
import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalcLucro;
import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalcPrejuizo;
import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalculo;

public class CalculoFactory {
    public static StrategyCalculo criarCalculo(String pTipoCalculo){
        switch(pTipoCalculo){
            case "FIXO":
                return new StrategyCalcFixo();

            case "LUCRO":
                return new StrategyCalcLucro();

            case "PREJUIZO":
                return new StrategyCalcPrejuizo();

            default:
                return null;
        }
    };
}
