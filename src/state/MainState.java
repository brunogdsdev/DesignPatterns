package org.designpatterns.state;

public class MainState {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.preparar();
        pedido.iniciarEntrega();
        pedido.finalizarEntrega();
        System.out.println(pedido.getEstado());
    }
}
