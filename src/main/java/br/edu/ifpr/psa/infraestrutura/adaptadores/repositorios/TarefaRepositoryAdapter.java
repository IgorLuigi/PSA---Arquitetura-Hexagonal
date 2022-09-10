package br.edu.ifpr.psa.infraestrutura.adaptadores.repositorios;

import br.edu.ifpr.psa.portas.repository.SalvarTarefaRepositoryPort;
import br.edu.ifpr.psa.portas.repository.BuscarTarefaRepositoryPort;
import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.TarefaEntity;
import br.edu.ifpr.psa.mapper.dto.TarefaDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TarefaRepositoryAdapter implements BuscarTarefaRepositoryPort, SalvarTarefaRepositoryPort {

    private final SpringTarefaRepository springTarefaRepository;

    public TarefaRepositoryAdapter(SpringTarefaRepository springTarefaRepository) {
        this.springTarefaRepository = springTarefaRepository;
    }

    @Override
    public List<TarefaDTO> buscarTodos() {
        List<TarefaEntity> tarefasEntidades = this.springTarefaRepository.findAll();
        return tarefasEntidades.stream().map(TarefaEntity::toTarefaDTO).collect(Collectors.toList());
    }

    @Override
    public void salvar(TarefaDTO tarefaDTO) {
        TarefaEntity tarefaEntity = new TarefaEntity(tarefaDTO);

        this.springTarefaRepository.save(tarefaEntity);
    }
}
