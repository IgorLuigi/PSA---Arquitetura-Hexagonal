package br.edu.ifpr.psa.infraestrutura.adaptadores.entidades;

import br.edu.ifpr.psa.dominio.Tarefa;
import br.edu.ifpr.psa.mapper.dto.TarefaDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tarefa")
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descricao;
    private Boolean tarefaConcluida;
    private Date dataEntrega;

    public TarefaEntity() {
    }

    public TarefaEntity(Tarefa tarefa) {
        this.titulo = tarefa.getTitulo();
        this.descricao = tarefa.getDescricao();
        this.tarefaConcluida = tarefa.getTarefaConcluida();
        this.dataEntrega = tarefa.getDataEntrega();
    }

    public TarefaEntity(TarefaDTO tarefaDTO) {
        this.titulo = tarefaDTO.getTitulo();
        this.descricao = tarefaDTO.getDescricao();
        this.tarefaConcluida = tarefaDTO.getTarefaConcluida();
        this.dataEntrega = tarefaDTO.getDataEntrega();
    }


    public Tarefa toTarefa() {
        return new Tarefa(this.titulo, this.descricao, this.tarefaConcluida, this.dataEntrega);
    }

    public TarefaDTO toTarefaDTO() {
        return new TarefaDTO(this.titulo, this.descricao, this.tarefaConcluida, this.dataEntrega);
    }
}
