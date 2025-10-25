package org.designpatterns.factorymethod;

import org.designpatterns.strategy.exemplo2.Produto;

public class MainFactoryMethod {

    public static void main(String[] args) {

        Produto prod1 = new Produto("TesteProd", 500, CalculoFactory.criarCalculo("FIXO"));
        prod1.calcularPrecoFinal();
        System.out.println(prod1);

        prod1.trocarEstrategia(CalculoFactory.criarCalculo("LUCRO"));
        prod1.calcularPrecoFinal();
        System.out.println(prod1);

        prod1.trocarEstrategia(CalculoFactory.criarCalculo("PREJUIZO"));
        prod1.calcularPrecoFinal();
        System.out.println(prod1);
    }
}
