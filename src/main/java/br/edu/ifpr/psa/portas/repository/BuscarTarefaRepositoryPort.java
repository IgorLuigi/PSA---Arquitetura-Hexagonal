package br.edu.ifpr.psa.portas.repository;

import java.util.List;
import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.mapper.dto.TarefaDTO;

public interface BuscarTarefaRepositoryPort {
    List<TarefaDTO> buscarTodos();
}