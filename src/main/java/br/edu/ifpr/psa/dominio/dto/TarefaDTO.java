package br.edu.ifpr.psa.dominio.dto;

public class TarefaDTO {
    private String titulo;
    private String descricao;
    private Boolean tarefaConcluida;

    public TarefaDTO(String titulo, String descricao, Boolean tarefaConcluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getTarefaConcluida() {
        return tarefaConcluida;
    }
}
