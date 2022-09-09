package br.edu.ifpr.psa.dominio.adaptadores.services;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.dominio.dto.TarefaDTO;
import br.edu.ifpr.psa.dominio.portas.interfaces.TarefaServicePort;
import br.edu.ifpr.psa.dominio.portas.repository.TarefaRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class TarefaServiceImpl implements TarefaServicePort {

    private final TarefaRepositoryPort tarefaRepository;

    public TarefaServiceImpl(TarefaRepositoryPort tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @Override
    public void criarTarefa(TarefaDTO tarefaDTO) {
        Tarefa tarefa = new Tarefa(tarefaDTO);

        this.tarefaRepository.salvar(tarefa);
    }


    @Override
    public List<TarefaDTO> buscarTarefas() {
        List<Tarefa> tarefas = this.tarefaRepository.buscarTodos();
        List<TarefaDTO> tarefasDTO = tarefas.stream().map(Tarefa::toTarefaDTO).collect(Collectors.toList());

        return tarefasDTO;
    }


}
