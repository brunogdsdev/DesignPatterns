package org.designpatterns.strategy.exemplo2;

import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalcFixo;
import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalcLucro;
import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalcPrejuizo;
import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalculo;

public class Main {
    public static void main(String[] args) {
        StrategyCalculo lucro = new StrategyCalcLucro();
        StrategyCalculo prejuizo = new StrategyCalcPrejuizo();
        StrategyCalculo fixo = new StrategyCalcFixo();

        Produto prod1 = new Produto("Abacaxi", 100, lucro);
        prod1.calcularPrecoFinal();
        System.out.println(prod1.toString());
        prod1.trocarEstrategia(fixo);
        prod1.calcularPrecoFinal();
        System.out.println(prod1.toString());

//        Produto prod2 = new Produto("Manga", 100, prejuizo);
//        prod2.calcularPrecoFinal();
//        System.out.println(prod2.toString());
//
//        Produto prod3 = new Produto("Uva", 50, fixo);
//        prod3.calcularPrecoFinal();
//        System.out.println(prod3.toString());

    }
}
