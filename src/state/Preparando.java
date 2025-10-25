package org.designpatterns.state;

public class Preparando implements EstadoPedido{
    @Override
    public void preparar(Pedido pedido) {
        throw new RuntimeException("Pedido já está sendo preparado");
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        pedido.setEstado(new EntregaIniciada());
    }

    @Override
    public void finalizarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido ainda está sendo preparado e ainda nao foi entregue");
    }
}
