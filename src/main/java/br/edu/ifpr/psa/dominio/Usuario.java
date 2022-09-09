package br.edu.ifpr.psa.dominio;

import br.edu.ifpr.psa.dominio.dto.TarefaDTO;
import br.edu.ifpr.psa.dominio.dto.UsuarioDTO;

public class Usuario {

    private String nome;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(UsuarioDTO usuarioDTO) {
        this.nome = usuarioDTO.getNome();
        this.email = usuarioDTO.getEmail();
    }

    public UsuarioDTO toUsuarioDTO() {
        return new UsuarioDTO(this.nome, this.email);
    }
}
