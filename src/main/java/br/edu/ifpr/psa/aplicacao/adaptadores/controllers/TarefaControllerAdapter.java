package br.edu.ifpr.psa.aplicacao.adaptadores.controllers;

import br.edu.ifpr.psa.mapper.dto.TarefaDTO;
import br.edu.ifpr.psa.portas.interfaces.BuscarTarefaServicePort;
import br.edu.ifpr.psa.portas.interfaces.CriarTarefaServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaControllerAdapter {

    private final BuscarTarefaServicePort buscarTarefaServicePort;
    private final CriarTarefaServicePort criarTarefaServicePort;

    public TarefaControllerAdapter(BuscarTarefaServicePort buscarTarefaServicePort, CriarTarefaServicePort criarTarefaServicePort) {
        this.buscarTarefaServicePort = buscarTarefaServicePort;
        this.criarTarefaServicePort = criarTarefaServicePort;
    }

    @GetMapping("/listar")
    List<TarefaDTO> listarTarefas() {
        return buscarTarefaServicePort.buscarTarefas();
    }

    @PostMapping("/cadastrar")
    void cadastrarTarefa(@RequestBody TarefaDTO tarefaDTO) {
        criarTarefaServicePort.criarTarefa(tarefaDTO);
    }
}
