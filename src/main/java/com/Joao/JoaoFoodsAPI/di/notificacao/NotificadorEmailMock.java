package com.Joao.JoaoFoodsAPI.di.notificacao;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

    public NotificadorEmailMock(){
        System.out.println("NotificadorEmail Mock");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
