package br.edu.ifpr.psa.infraestrutura.adaptadores.repositorios;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.dominio.portas.repository.TarefaRepositoryPort;
import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.TarefaEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class TarefaRepository implements TarefaRepositoryPort {

    private final SpringTarefaRepository springTarefaRepository;

    public TarefaRepository(SpringTarefaRepository springTarefaRepository) {
        this.springTarefaRepository = springTarefaRepository;
    }

    @Override
    public List<Tarefa> buscarTodos() {
        List<TarefaEntity> tarefasEntidades = this.springTarefaRepository.findAll();
        return tarefasEntidades.stream().map(TarefaEntity::toTarefa).collect(Collectors.toList());
    }

    @Override
    public void salvar(Tarefa tarefa) {
        TarefaEntity tarefaEntity = new TarefaEntity(tarefa);

        this.springTarefaRepository.save(tarefaEntity);
    }
}
