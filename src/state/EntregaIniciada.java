package org.designpatterns.state;

public class EntregaIniciada implements EstadoPedido{
    @Override
    public void preparar(Pedido pedido) {
        throw new RuntimeException("Pedido já foi preparado.");
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido já tem entrega iniciada.");
    }

    @Override
    public void finalizarEntrega(Pedido pedido) {
        pedido.setEstado(new EntregaFinalizada());
    }
}
