package org.designpatterns.state;

public class Pedido {
    EstadoPedido estado;

    public Pedido(EstadoPedido estado){
        this.estado = estado;
    }

    public Pedido(){
        this.estado = new Realizado();
    }

    public EstadoPedido getEstado(){
        return this.estado;
    }

    public void setEstado(EstadoPedido novoEstado){
        this.estado = novoEstado;
    }

    public void preparar(){
        this.estado.preparar(this);
    }

    public void iniciarEntrega(){
        this.estado.iniciarEntrega(this);
    }

    public void finalizarEntrega(){
        this.estado.finalizarEntrega(this);
    }
}
