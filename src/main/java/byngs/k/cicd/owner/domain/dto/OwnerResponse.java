package byngs.k.cicd.owner.domain.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class OwnerResponse {

    private Long id;

    private String name;

    private String address;

    private String city;

    private String cellphone;

    private List<PetResponse> pets;

    protected OwnerResponse(Long id, String name, String address, String city, String cellphone, List<PetResponse> pets) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.cellphone = cellphone;
        this.pets = pets;
    }

    public static OwnerResponse of(Long id, String name, String address, String city, String cellphone, List<PetResponse> pets) {
        return new OwnerResponse(id, name, address, city, cellphone, pets);
    }
}
