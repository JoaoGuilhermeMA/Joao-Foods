package com.Joao.JoaoFoodsAPI;

import com.Joao.JoaoFoodsAPI.di.notificacao.Notificador;
import com.Joao.JoaoFoodsAPI.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;

public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
}
