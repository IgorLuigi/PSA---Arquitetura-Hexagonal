package br.edu.ifpr.psa.aplicacao.adaptadores.controllers;

import br.edu.ifpr.psa.dominio.dto.TarefaDTO;
import br.edu.ifpr.psa.dominio.portas.interfaces.TarefaServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final TarefaServicePort tarefaServicePort;



    public UsuarioController(TarefaServicePort tarefaServicePort) {
        this.tarefaServicePort = tarefaServicePort;

    }

    @GetMapping("/listar")
    List<TarefaDTO> listarTarefas() {
        return tarefaServicePort.buscarTarefas();
    }

    @PostMapping("/cadastrar")
    void cadastrarTarefa(@RequestBody TarefaDTO tarefaDTO) {
        tarefaServicePort.criarTarefa(tarefaDTO);
    }
}
