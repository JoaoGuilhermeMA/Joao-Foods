package com.Joao.JoaoFoodsAPI.di.notificacao;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
