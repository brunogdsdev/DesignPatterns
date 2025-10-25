package org.designpatterns.state;

public interface EstadoPedido {
    void preparar(Pedido pedido);
    void iniciarEntrega(Pedido pedido);
    void finalizarEntrega(Pedido pedido);

}
