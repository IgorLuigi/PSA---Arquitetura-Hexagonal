package br.edu.ifpr.psa.infraestrutura.adaptadores.repositorios;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.dominio.Usuario;
import br.edu.ifpr.psa.dominio.portas.repository.TarefaRepositoryPort;
import br.edu.ifpr.psa.dominio.portas.repository.UsuarioRepositoryPort;
import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.TarefaEntity;
import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UsuarioRepository implements UsuarioRepositoryPort {

    private final SpringUsuarioRepository springUsuarioRepository;

    public UsuarioRepository(SpringUsuarioRepository springUsuarioRepository) {
        this.springUsuarioRepository = springUsuarioRepository;
    }

    @Override
    public List<Usuario> buscarTodos() {
        List<UsuarioEntity> usuariosEntidades = this.springUsuarioRepository.findAll();
        return usuariosEntidades.stream().map(UsuarioEntity::toUsuario).collect(Collectors.toList());
    }

    @Override
    public void salvar(Usuario usuario) {
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);

        this.springUsuarioRepository.save(usuarioEntity);
    }
}
