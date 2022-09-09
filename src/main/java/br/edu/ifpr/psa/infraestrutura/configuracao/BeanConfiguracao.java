package br.edu.ifpr.psa.infraestrutura.configuracao;

import br.edu.ifpr.psa.dominio.adaptadores.services.TarefaServiceImpl;
import br.edu.ifpr.psa.dominio.portas.interfaces.TarefaServicePort;
import br.edu.ifpr.psa.dominio.portas.repository.TarefaRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    TarefaServicePort tarefaService(TarefaRepositoryPort tarefaRepositoryPort) {
        return new TarefaServiceImpl(tarefaRepositoryPort);
    }



}
