package org.designpatterns.bridge.relatorios;

import org.designpatterns.bridge.model.Produto;
import org.designpatterns.bridge.visualizadores.VisualizadorDeRelatorios;

import java.util.List;

public class RelatorioSimples extends GeradorDeRelatorios{

    public RelatorioSimples(VisualizadorDeRelatorios visualizador){
        super(visualizador);
    }

    @Override
    protected String gerarConteudo(List<Produto> produtos) {
        double totalProduto = 0;
        StringBuilder conteudo = new StringBuilder();

        for(Produto produto : produtos){
            totalProduto += produto.getPreco();
        }

        conteudo.append("QUANTIDADE: "+produtos.size()+"\n");
        conteudo.append("TOTAL VENDIDO:"+ totalProduto+"\n");

        return conteudo.toString();
    }

    @Override
    protected void gerarVisualizacao(String cabecalho, String conteudo) {
        this.visualizador.gerarVisualizacaoDoRelatorio(cabecalho, conteudo);
    }
}
