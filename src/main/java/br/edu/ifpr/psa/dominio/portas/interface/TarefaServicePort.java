public interface TarefaServicePort {

    List<TarefaDTO> buscarTarefas();

    void criarTarefa(TarefaDTO tarefaDTO);

    void atualizarTarefa(String sku, TarefaDTO tarefaDTO) throws NotFoundException;
}