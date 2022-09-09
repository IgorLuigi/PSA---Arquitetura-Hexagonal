package br.edu.ifpr.psa.dominio.portas.interfaces;

import br.edu.ifpr.psa.dominio.dto.TarefaDTO;
import br.edu.ifpr.psa.dominio.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioServicePort {

    List<UsuarioDTO> buscarTarefas();

    void criarTarefa(UsuarioDTO usuarioDTO);
}
