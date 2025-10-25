package org.designpatterns.templatemethod.exemplo2.relatorios;

import org.designpatterns.templatemethod.exemplo2.Produto;

import java.util.List;

public class RelatorioSimplesConsole extends GeradorDeRelatorios{

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
        System.out.println("-------------------------------------------------\n");
        System.out.println(cabecalho);
        System.out.println(conteudo);
        System.out.println("-------------------------------------------------\n");
    }
}
