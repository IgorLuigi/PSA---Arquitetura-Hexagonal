package br.edu.ifpr.psa.infraestrutura.adaptadores.repositorios;

import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.TarefaEntity;
import br.edu.ifpr.psa.infraestrutura.adaptadores.entidades.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
