package br.com.mastertech.dnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public  String dnd(){
        return "<h1>Boas vindas!</h1> <a href = /iniciar> iniciar</p>";

    }
    @GetMapping("/iniciar")
    public  String formulario(){
        return "<form action=\"resultado\">\n" +
                "    <input type=\"Lados\">\n" +
                "    <input type=\"Vezes\">\n" +
                "    <button>Jogar</button>\n" +
                "</form>";
    }
    @GetMapping("/resultado")
    public String resultado (){
        return "<h1>o resultado é 100</h1>";

    }
}
