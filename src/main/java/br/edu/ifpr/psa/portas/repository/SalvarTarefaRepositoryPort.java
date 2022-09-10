package br.edu.ifpr.psa.portas.repository;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.mapper.dto.TarefaDTO;

import java.util.List;

public interface SalvarTarefaRepositoryPort {
    void salvar(TarefaDTO tarefaDTO);
}