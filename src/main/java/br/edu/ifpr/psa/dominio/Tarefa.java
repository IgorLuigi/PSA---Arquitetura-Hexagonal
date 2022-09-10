package br.edu.ifpr.psa.dominio;

import br.edu.ifpr.psa.mapper.dto.TarefaDTO;

import java.util.Date;

public class Tarefa {
    
    private String titulo;
    private String descricao;
    private Boolean tarefaConcluida;
    private Date dataEntrega;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, Boolean tarefaConcluida, Date dataEntrega) {
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

    public Tarefa(TarefaDTO tarefaDTO) {
        this.titulo = tarefaDTO.getTitulo();
        this.descricao = tarefaDTO.getDescricao();
        this.tarefaConcluida = tarefaDTO.getTarefaConcluida();
        this.dataEntrega = tarefaDTO.getDataEntrega();
    }

    public TarefaDTO toTarefaDTO() {
        return new TarefaDTO(this.titulo, this.descricao, this.tarefaConcluida, this.dataEntrega);
    }

    Boolean isDataEntregaAtrasada(Date dataEntrega) {

        if (dataEntrega != null) {
            Date dataAtual = new Date();

            if (dataEntrega.getTime() < dataAtual.getTime()) {
                return true;
            }

            return false;
        }

        return null;
    }
}
