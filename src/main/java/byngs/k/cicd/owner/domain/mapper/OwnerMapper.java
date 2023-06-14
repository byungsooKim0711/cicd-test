package byngs.k.cicd.owner.domain.mapper;

import byngs.k.cicd.owner.domain.Owner;
import byngs.k.cicd.owner.domain.dto.OwnerResponse;

import java.util.stream.Collectors;

public final class OwnerMapper {

    public static OwnerResponse mapToDomainEntity(Owner owner) {
        return OwnerResponse.of(
                owner.getId(),
                owner.getName(),
                owner.getAddress(),
                owner.getCity(),
                owner.getCellphone(),
                owner.getPets()
                        .stream()
                        .map(PetMapper::mapToDomainEntity)
                        .collect(Collectors.toList())
        );
    }
}
