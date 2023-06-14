package byngs.k.cicd.owner.application.input;

import byngs.k.cicd.owner.domain.dto.OwnerResponse;

import java.util.List;

public interface OwnerUseCase {

    List<OwnerResponse> findOwners();

    OwnerResponse findOwnerById(Long id);

    OwnerResponse findOwnerByName(String name);
}
