package br.edu.ifpr.psa.dominio;

import br.edu.ifpr.psa.dominio.dto.TarefaDTO;

public class Tarefa {
    
    private String titulo;
    private String descricao;
    private Boolean tarefaConcluida;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, Boolean tarefaConcluida) {
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

    public Tarefa(TarefaDTO tarefaDTO) {
        this.titulo = tarefaDTO.getTitulo();
        this.descricao = tarefaDTO.getDescricao();
        this.tarefaConcluida = tarefaDTO.getTarefaConcluida();
    }

    public TarefaDTO toTarefaDTO() {
        return new TarefaDTO(this.titulo, this.descricao, this.tarefaConcluida);
    }
}
