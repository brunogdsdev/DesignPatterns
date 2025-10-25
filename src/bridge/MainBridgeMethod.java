package org.designpatterns.bridge;


import org.designpatterns.bridge.model.Produto;
import org.designpatterns.bridge.relatorios.GeradorDeRelatorios;
import org.designpatterns.bridge.relatorios.RelatorioAnalitico;
import org.designpatterns.bridge.relatorios.RelatorioSimples;
import org.designpatterns.bridge.visualizadores.VisualizacaoConsole;
import org.designpatterns.bridge.visualizadores.VisualizacaoGUI;
import org.designpatterns.bridge.visualizadores.VisualizadorDeRelatorios;

import java.util.ArrayList;
import java.util.List;

public class MainBridgeMethod {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Mouse", 19));
        produtos.add(new Produto("Teclado", 25));
        produtos.add(new Produto("memoria", 10));

        VisualizacaoConsole visualizacaoConsole = new VisualizacaoConsole();
        VisualizadorDeRelatorios visualizacaoGUI = new VisualizacaoGUI();

        GeradorDeRelatorios relatorioSimples = new RelatorioSimples(visualizacaoConsole);
        relatorioSimples.gerarRelatorios(produtos);

        GeradorDeRelatorios relatorioGui = new RelatorioAnalitico(visualizacaoGUI);
        relatorioGui.gerarRelatorios(produtos);
    }
}
