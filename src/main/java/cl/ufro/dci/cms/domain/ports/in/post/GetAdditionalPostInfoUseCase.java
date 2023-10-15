package cl.ufro.dci.cms.domain.ports.in.post;

import cl.ufro.dci.cms.domain.model.AdditionalPostInfo;

public interface GetAdditionalPostInfoUseCase {
    AdditionalPostInfo getAdditionalPostInfo(Integer postId);
}
