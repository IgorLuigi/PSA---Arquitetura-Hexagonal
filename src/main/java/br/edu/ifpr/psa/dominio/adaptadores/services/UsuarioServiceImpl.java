package br.edu.ifpr.psa.dominio.adaptadores.services;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.dominio.Usuario;
import br.edu.ifpr.psa.dominio.dto.TarefaDTO;
import br.edu.ifpr.psa.dominio.dto.UsuarioDTO;
import br.edu.ifpr.psa.dominio.portas.interfaces.TarefaServicePort;
import br.edu.ifpr.psa.dominio.portas.interfaces.UsuarioServicePort;
import br.edu.ifpr.psa.dominio.portas.repository.TarefaRepositoryPort;
import br.edu.ifpr.psa.dominio.portas.repository.UsuarioRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioServiceImpl implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepositoryPort usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDTO> buscarTarefas() {
        List<Usuario> usuarios = this.usuarioRepository.buscarTodos();
        List<UsuarioDTO> usuariosDTO = usuarios.stream().map(Usuario::toUsuarioDTO).collect(Collectors.toList());

        return usuariosDTO;
    }

    @Override
    public void criarTarefa(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(usuarioDTO);

        this.usuarioRepository.salvar(usuario);
    }


}
