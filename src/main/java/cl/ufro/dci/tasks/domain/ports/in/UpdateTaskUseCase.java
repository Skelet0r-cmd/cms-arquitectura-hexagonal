package cl.ufro.dci.tasks.domain.ports.in;

import cl.ufro.dci.tasks.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updatedTask);
}
