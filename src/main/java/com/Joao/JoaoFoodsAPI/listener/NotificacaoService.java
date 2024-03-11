package com.Joao.JoaoFoodsAPI.listener;

import com.Joao.JoaoFoodsAPI.di.notificacao.NivelUrgencia;
import com.Joao.JoaoFoodsAPI.di.notificacao.Notificador;
import com.Joao.JoaoFoodsAPI.di.notificacao.TipoDoNotificador;
import com.Joao.JoaoFoodsAPI.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void CLienteAtivadoListener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }

}
