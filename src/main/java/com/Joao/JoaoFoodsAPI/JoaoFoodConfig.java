package com.Joao.JoaoFoodsAPI;

import com.Joao.JoaoFoodsAPI.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class JoaoFoodConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.JoaoFoods.com.br");
        notificadorEmail.setCaixaAlta(true);

        return notificadorEmail;
    }
}
