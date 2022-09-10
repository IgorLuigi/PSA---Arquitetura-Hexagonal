package br.edu.ifpr.psa.mapper.dto;

import java.util.Date;

public class TarefaDTO {
    private String titulo;
    private String descricao;
    private Boolean tarefaConcluida;
    private Date dataEntrega;

    public TarefaDTO(String titulo, String descricao, Boolean tarefaConcluida, Date dataEntrega) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
        this.dataEntrega = dataEntrega;
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

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
