package byngs.k.cicd.owner.domain.mapper;

import byngs.k.cicd.owner.domain.Pet;
import byngs.k.cicd.owner.domain.dto.PetResponse;

import java.util.stream.Collectors;

public final class PetMapper {

    public static PetResponse mapToDomainEntity(Pet pet) {
        return PetResponse.of(
                pet.getId(),
                pet.getName(),
                pet.getBirthDate(),
                PetTypeMapper.mapToDomainEntity(pet.getType()),
                pet.getVisits()
                        .stream()
                        .map(VisitMapper::mapToDomainEntity)
                        .collect(Collectors.toSet())
        );
    }
}
