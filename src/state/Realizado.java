package org.designpatterns.state;

public class Realizado implements EstadoPedido{

    @Override
    public void preparar(Pedido pedido) {
        pedido.setEstado(new Preparando());
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido ainda nao foi preparado.");
    }

    @Override
    public void finalizarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido ainda nao foi preparado.");
    }
}
