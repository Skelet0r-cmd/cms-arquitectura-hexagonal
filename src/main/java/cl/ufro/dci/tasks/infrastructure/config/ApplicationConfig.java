package cl.ufro.dci.tasks.infrastructure.config;

import cl.ufro.dci.tasks.application.usecases.*;
import cl.ufro.dci.tasks.application.usecases.*;
import cl.ufro.dci.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import cl.ufro.dci.tasks.domain.ports.out.TaskRepositoryPort;
import cl.ufro.dci.tasks.infrastructure.repositories.JpaTaskRepositoryAdapter;
import cl.ufro.dci.tasks.application.services.TaskService;
import cl.ufro.dci.tasks.domain.ports.out.ExternalServicePort;
import cl.ufro.dci.tasks.infrastructure.adapters.ExternalServiceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
