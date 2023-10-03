package cl.ufro.dci.tasks.application.usecases;

import cl.ufro.dci.tasks.domain.model.Task;
import cl.ufro.dci.tasks.domain.ports.in.CreateTaskUseCase;
import cl.ufro.dci.tasks.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
