package byngs.k.cicd.owner.domain.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Set;

@Getter
public class PetResponse {

    private Long id;

    private String name;

    private LocalDate birthDate;

    private PetTypeResponse type;

    private Set<VisitResponse> visits;

    protected PetResponse(Long id, String name, LocalDate birthDate, PetTypeResponse type, Set<VisitResponse> visits) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
        this.visits = visits;
    }

    public static PetResponse of(Long id, String name, LocalDate birthDate, PetTypeResponse type, Set<VisitResponse> visits) {
        return new PetResponse(id, name, birthDate, type, visits);
    }
}
