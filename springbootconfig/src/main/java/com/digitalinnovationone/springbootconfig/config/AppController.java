package com.digitalinnovationone.springbootconfig.config;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// ao executar o projeto vai mostrar a mensagem em desenvolvimento ou em produção
@RestController
public class AppController {

    @org.springframework.beans.factory.annotation.Value("${app.message}") // vai injetar todos os valores que tem o início app.message
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }
}
