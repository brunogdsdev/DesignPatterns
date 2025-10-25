package org.designpatterns.templatemethod.exemplo2.relatorios;

import org.designpatterns.templatemethod.exemplo2.Produto;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RelatorioAnaliticoGUI extends GeradorDeRelatorios{

    @Override
    protected String gerarCabecalho(){
        SimpleDateFormat sdf = new SimpleDateFormat("H:m:s d/M/y G");
        return new String(
                "RELATORIO ANALITICO DE PRODUTOS VENDIDOS\n"+
                        sdf.format(new Date())+"\n"+
                        "BLSoft Sistemas Dev Corp.\n"
        );
    }

    @Override
    protected String gerarConteudo(List<Produto> produtos) {
        StringBuilder conteudo = new StringBuilder();
        double totalProdutos = 0;
        conteudo.append("\nProdutos vendidos\n");
        for(Produto produto : produtos){
            totalProdutos += produto.getPreco();
            conteudo.append(produto.getNome()+ "R$: "+produto.getPreco()+ "\n");
        }

        conteudo.append("\nTotal:\n"+totalProdutos);
        return conteudo.toString();
    }

    @Override
    protected void gerarVisualizacao(String cabecalho, String conteudo) {
        JOptionPane.showMessageDialog(null, cabecalho + conteudo, "Relatorio Analitico", JOptionPane.INFORMATION_MESSAGE);
    }
}
