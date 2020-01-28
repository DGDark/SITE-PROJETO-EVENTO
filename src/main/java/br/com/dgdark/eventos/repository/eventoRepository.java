package br.com.dgdark.eventos.repository;

import br.com.dgdark.eventos.model.eventoModel;
import org.springframework.data.repository.CrudRepository;

public interface eventoRepository  extends CrudRepository<eventoModel, String> {

}
