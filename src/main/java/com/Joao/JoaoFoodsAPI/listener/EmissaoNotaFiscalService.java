package com.Joao.JoaoFoodsAPI.listener;


import com.Joao.JoaoFoodsAPI.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void ClienteAtivadoListener(ClienteAtivadoEvent event){
        System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
    }
}
