package com.Joao.JoaoFoodsAPI.di.service;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;
import com.Joao.JoaoFoodsAPI.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if (notificador != null) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }else {
            System.out.println("Não existe notificador, mas cliente foi ativado");
        }


    }

}
