package cl.ufro.dci.tasks.domain.ports.in;

import cl.ufro.dci.tasks.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
