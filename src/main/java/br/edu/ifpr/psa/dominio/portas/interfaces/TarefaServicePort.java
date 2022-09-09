package br.edu.ifpr.psa.dominio.portas.interfaces;

import br.edu.ifpr.psa.dominio.dto.TarefaDTO;

import java.util.List;

public interface TarefaServicePort {

    List<TarefaDTO> buscarTarefas();

    void criarTarefa(TarefaDTO tarefaDTO);
}
