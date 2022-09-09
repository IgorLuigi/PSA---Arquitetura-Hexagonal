package br.edu.ifpr.psa.infraestrutura.adaptadores.repositorios;

import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringTarefaRepository extends JpaRepository<TarefaEntity, Long> {

}
