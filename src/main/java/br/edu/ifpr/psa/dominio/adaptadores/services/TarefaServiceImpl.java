package br.edu.ifpr.psa.dominio.adaptadores.services;

import br.edu.ifpr.psa.mapper.dto.TarefaDTO;
import br.edu.ifpr.psa.portas.interfaces.BuscarTarefaServicePort;
import br.edu.ifpr.psa.portas.interfaces.CriarTarefaServicePort;
import br.edu.ifpr.psa.portas.repository.BuscarTarefaRepositoryPort;
import br.edu.ifpr.psa.portas.repository.SalvarTarefaRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements BuscarTarefaServicePort, CriarTarefaServicePort {

    private final BuscarTarefaRepositoryPort buscarTarefaRepositoryPort;

    private final SalvarTarefaRepositoryPort salvarTarefaRepositoryPort;

    public TarefaServiceImpl(BuscarTarefaRepositoryPort buscarTarefaRepositoryPort, SalvarTarefaRepositoryPort salvarTarefaRepositoryPort) {
        this.buscarTarefaRepositoryPort = buscarTarefaRepositoryPort;
        this.salvarTarefaRepositoryPort = salvarTarefaRepositoryPort;
    }

    @Override
    public void criarTarefa(TarefaDTO tarefaDTO) {

        this.salvarTarefaRepositoryPort.salvar(tarefaDTO);
    }


    @Override
    public List<TarefaDTO> buscarTarefas() {
        List<TarefaDTO> tarefasDTO = this.buscarTarefaRepositoryPort.buscarTodos();

        return tarefasDTO;
    }


}
