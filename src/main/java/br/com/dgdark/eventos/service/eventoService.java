package br.com.dgdark.eventos.service;

import br.com.dgdark.eventos.model.eventoModel;
import br.com.dgdark.eventos.repository.eventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class eventoService {
    @Autowired
    private eventoRepository repository;

    public eventoModel cadastrarEvento(eventoModel evento){
        return repository.save(evento);
    }




}
