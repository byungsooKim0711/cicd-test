package byngs.k.cicd.owner.domain.mapper;

import byngs.k.cicd.owner.domain.PetType;
import byngs.k.cicd.owner.domain.dto.PetTypeResponse;

public final class PetTypeMapper {

    public static PetTypeResponse mapToDomainEntity(PetType petType) {
        return PetTypeResponse.of(petType.getId(), petType.getName());
    }
}
