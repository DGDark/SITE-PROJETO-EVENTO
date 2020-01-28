package br.com.dgdark.eventos.controller;

import br.com.dgdark.eventos.model.eventoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.com.dgdark.eventos.service.eventoService;

@Controller
public class eventoController {
    @Autowired
    private eventoService service;

    @GetMapping
    public String home(){
        return "index";

    }
    @PostMapping ("/cadastrar")
        public String cadastarEvento (eventoModel evento){
            service.cadastrarEvento(evento);
        return "/index";

    }

}
