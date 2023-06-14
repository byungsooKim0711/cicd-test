package byngs.k.cicd.owner.domain.dto;

import lombok.Getter;

@Getter
public class PetTypeResponse {

    private Long id;

    private String name;

    protected PetTypeResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static PetTypeResponse of(Long id, String name) {
        return new PetTypeResponse(id, name);
    }
}
