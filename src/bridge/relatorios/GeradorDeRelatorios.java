package org.designpatterns.bridge.relatorios;

import org.designpatterns.bridge.model.Produto;
import org.designpatterns.bridge.visualizadores.VisualizadorDeRelatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class GeradorDeRelatorios {
    // abstraçao dos visualizadores de relatorios
    protected VisualizadorDeRelatorios visualizador;

    // construtor que precisa de uma instancia de visualizador
    public GeradorDeRelatorios(VisualizadorDeRelatorios visualizador){
        this.visualizador = visualizador;
    }

    //template method organiza as chamadas dos metodos na ordem necessaria
    public final void gerarRelatorios(List<Produto> produtos){
        String cabecalho = this.gerarCabecalho();
        String conteudo = this.gerarConteudo(produtos);
        this.gerarVisualizacao(cabecalho, conteudo);
    }

    // cabecalho padrao
    protected String gerarCabecalho(){
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
        return new String("\nRelatorio de Produtos\n"+sdf.format(new Date())+"\nBlSoft\n");
    }


    protected abstract String gerarConteudo(List<Produto> produtos);


    //DEIXA A VISUALIZACAO PARA AS SUBCLASSES E AINDA: CADA SUBCLASSE VAI (PODE) TER UM VISUALIZADOR
    //DIFERENTE DEPENDENDO DO QUE A GENTE INJETAR NO CAMPO VisualizadorDeRelatorios visualizador dessa classe aqui
    protected abstract void gerarVisualizacao(String cabecalho, String conteudo);
}
