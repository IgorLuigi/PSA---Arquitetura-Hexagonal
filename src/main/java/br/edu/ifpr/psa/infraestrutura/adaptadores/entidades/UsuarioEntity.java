package br.edu.ifpr.psa.infraestrutura.adaptadores.entidades;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.dominio.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    public Usuario toUsuario() {
        return new Usuario(this.nome, this.email);
    }
}
