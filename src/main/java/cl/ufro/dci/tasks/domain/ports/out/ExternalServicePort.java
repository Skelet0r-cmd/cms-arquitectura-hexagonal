package cl.ufro.dci.tasks.domain.ports.out;

import cl.ufro.dci.tasks.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
