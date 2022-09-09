package br.edu.ifpr.psa.dominio.portas.repository;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.dominio.Usuario;

import java.util.List;

public interface UsuarioRepositoryPort {
    List<Usuario> buscarTodos();
    void salvar(Usuario usuario);
}