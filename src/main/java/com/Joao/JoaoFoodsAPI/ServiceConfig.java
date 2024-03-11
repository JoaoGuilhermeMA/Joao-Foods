package com.Joao.JoaoFoodsAPI;

import com.Joao.JoaoFoodsAPI.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;

public class ServiceConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService();
    }
}
