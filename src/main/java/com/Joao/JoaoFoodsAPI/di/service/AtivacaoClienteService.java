package com.Joao.JoaoFoodsAPI.di.service;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;
import com.Joao.JoaoFoodsAPI.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
/*
* package com.Joao.JoaoFoodsAPI.di.service;
import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;
import com.Joao.JoaoFoodsAPI.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class AtivacaoClienteService {
    @Autowired(required = false)
    private List<Notificador> notificadores;
    public void ativar(Cliente cliente) {
        cliente.ativar();
        for (Notificador notificador : notificadores) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }
    }
}
* */