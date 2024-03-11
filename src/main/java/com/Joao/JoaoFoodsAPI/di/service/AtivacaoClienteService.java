package com.Joao.JoaoFoodsAPI.di.service;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;
import com.Joao.JoaoFoodsAPI.di.notificacao.NivelUrgencia;
import com.Joao.JoaoFoodsAPI.di.notificacao.Notificador;
import com.Joao.JoaoFoodsAPI.di.notificacao.TipoDoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }

}