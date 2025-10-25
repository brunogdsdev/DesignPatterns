package org.designpatterns.state;

public class EntregaFinalizada implements EstadoPedido{
    @Override
    public void preparar(Pedido pedido) {
        throw new RuntimeException("Pedido já foi entregue.");
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido já foi entregue.");
    }

    @Override
    public void finalizarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido já foi entregue.");
    }
}
