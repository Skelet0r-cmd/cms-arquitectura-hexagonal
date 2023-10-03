package cl.ufro.dci.tasks.domain.ports.in;

import cl.ufro.dci.tasks.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
