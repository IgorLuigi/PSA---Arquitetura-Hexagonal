package br.edu.ifpr.psa.portas.interfaces;

import br.edu.ifpr.psa.mapper.dto.TarefaDTO;

public interface CriarTarefaServicePort {

    void criarTarefa(TarefaDTO tarefaDTO);
}
