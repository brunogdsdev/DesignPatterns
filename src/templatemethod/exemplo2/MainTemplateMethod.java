package org.designpatterns.templatemethod.exemplo2;

import org.designpatterns.templatemethod.exemplo2.relatorios.GeradorDeRelatorios;
import org.designpatterns.templatemethod.exemplo2.relatorios.RelatorioAnaliticoGUI;
import org.designpatterns.templatemethod.exemplo2.relatorios.RelatorioSimplesConsole;

import java.util.ArrayList;
import java.util.List;

public class MainTemplateMethod {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Mouse", 19));
        produtos.add(new Produto("Teclado", 25));
        produtos.add(new Produto("memoria", 10));

        GeradorDeRelatorios relatorioSimplesConsole = new RelatorioSimplesConsole();
        relatorioSimplesConsole.gerarRelatorios(produtos);

        GeradorDeRelatorios relatorioAnaliticoGUI = new RelatorioAnaliticoGUI();
        relatorioAnaliticoGUI.gerarRelatorios(produtos);
    }
}
