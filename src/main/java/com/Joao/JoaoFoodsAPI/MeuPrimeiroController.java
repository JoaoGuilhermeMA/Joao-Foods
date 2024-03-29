package com.Joao.JoaoFoodsAPI;

import com.Joao.JoaoFoodsAPI.di.modelo.Cliente;
import com.Joao.JoaoFoodsAPI.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController" + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao = new Cliente("João", "joao@xyz.com", "2312312312");

        ativacaoClienteService.ativar(joao);

        return "Ola!";
    }
}
