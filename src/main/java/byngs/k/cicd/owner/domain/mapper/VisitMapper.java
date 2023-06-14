package byngs.k.cicd.owner.domain.mapper;

import byngs.k.cicd.owner.domain.Visit;
import byngs.k.cicd.owner.domain.dto.VisitResponse;

public final class VisitMapper {

    public static VisitResponse mapToDomainEntity(Visit visit) {
        return VisitResponse.of(visit.getId(), visit.getVisitDate(), visit.getDescription());
    }
}
