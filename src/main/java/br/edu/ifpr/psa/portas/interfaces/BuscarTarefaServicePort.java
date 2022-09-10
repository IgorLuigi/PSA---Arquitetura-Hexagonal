package br.edu.ifpr.psa.portas.interfaces;

import br.edu.ifpr.psa.mapper.dto.TarefaDTO;

import java.util.List;

public interface BuscarTarefaServicePort {

    List<TarefaDTO> buscarTarefas();
}
