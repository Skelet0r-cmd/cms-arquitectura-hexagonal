package cl.ufro.dci.tasks.application.usecases;

import cl.ufro.dci.tasks.domain.model.AdditionalTaskInfo;
import cl.ufro.dci.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import cl.ufro.dci.tasks.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
