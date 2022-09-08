package br.edu.ifpr.psa.dominio.portas.repository;

import java.util.List;
import br.edu.ifpr.psa.dominio.Tarefa;

public interface TarefaRepositoryPort {
    List<Tarefa> buscarTodos();

    Tarefa buscarPeloSku(String sku);

    void salvar(Tarefa tarefa);
}