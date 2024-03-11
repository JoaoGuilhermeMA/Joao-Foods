package com.Joao.JoaoFoodsAPI.di.service;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;

public class ClienteAtivadoEvent {
    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente){
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
