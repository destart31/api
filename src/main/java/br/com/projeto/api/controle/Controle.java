package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controle {
    @GetMapping("/")
    public String test() {
        return "Olá Mundo!";
    }
}
