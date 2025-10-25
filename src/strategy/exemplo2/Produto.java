package org.designpatterns.strategy.exemplo2;

import org.designpatterns.strategy.exemplo2.estrategias.StrategyCalculo;

public class Produto {
    private String nome;
    private double preco;
    private double precoFinal;

    private StrategyCalculo estrategiaDeCalculo;

    public Produto(String nome, double preco, StrategyCalculo estrategiaDeCalculo) {
        this.nome = nome;
        this.preco = preco;
        this.estrategiaDeCalculo = estrategiaDeCalculo;
    }

    public void calcularPrecoFinal(){
        this.precoFinal = this.estrategiaDeCalculo.calcularLucro(this.preco);
    }

    public void trocarEstrategia(StrategyCalculo novaEstrategia){
        this.estrategiaDeCalculo = novaEstrategia;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", estrategiaDeCalculo=" + estrategiaDeCalculo +
                '}';
    }
}
