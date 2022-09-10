package br.edu.ifpr.psa.infraestrutura.configuracao;

import br.edu.ifpr.psa.dominio.adaptadores.services.TarefaServiceImpl;
import br.edu.ifpr.psa.portas.interfaces.BuscarTarefaServicePort;
import br.edu.ifpr.psa.portas.repository.BuscarTarefaRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    BuscarTarefaServicePort tarefaService(BuscarTarefaRepositoryPort buscarTarefaRepositoryPort) {
        return new TarefaServiceImpl(buscarTarefaRepositoryPort);
    }

}
