package cl.ufro.dci.tasks.application.usecases;

import cl.ufro.dci.tasks.domain.model.Task;
import cl.ufro.dci.tasks.domain.ports.in.UpdateTaskUseCase;
import cl.ufro.dci.tasks.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepositoryPort.update(updatedTask);
    }
}
