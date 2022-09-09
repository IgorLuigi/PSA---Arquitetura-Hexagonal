package br.edu.ifpr.psa.infraestrutura.adaptadores.entidades;

import br.edu.ifpr.psa.dominio.Tarefa;

import javax.persistence.*;

@Entity
@Table(name = "tarefa")
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descricao;
    private Boolean tarefaConcluida;

    public TarefaEntity() {
    }

    public TarefaEntity(Tarefa tarefa) {
        this.titulo = tarefa.getTitulo();
        this.descricao = tarefa.getDescricao();
        this.tarefaConcluida = tarefa.getTarefaConcluida();
    }

    public Tarefa toTarefa() {
        return new Tarefa(this.titulo, this.descricao, this.tarefaConcluida);
    }
}
