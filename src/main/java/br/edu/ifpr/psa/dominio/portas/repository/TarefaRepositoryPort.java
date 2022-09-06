public interface TarefaRepositoryPort {
    List<Tarefa> buscarTodos();

    Tarefa buscarPeloSku(String sku);

    void salvar(Tarefa tarefa);
}