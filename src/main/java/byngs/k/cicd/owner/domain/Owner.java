package byngs.k.cicd.owner.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import org.springframework.core.style.ToStringCreator;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "tb_owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "name")
    private String name;

    @NotEmpty
    @Column(name = "address")
    private String address;

    @NotEmpty
    @Column(name = "city")
    private String city;

    @NotEmpty
    @Column(name = "cellphone")
    private String cellphone;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    private List<Pet> pets = new ArrayList<>();

    public boolean isNew() {
        return this.id == null;
    }

    public void addPet(Pet pet) {
        if (pet.isNew()) {
            getPets().add(pet);
        }
    }

    public Pet getPet(String name) {
        return getPet(name, false);
    }

    public Pet getPet(Long id) {
        for (Pet pet : getPets()) {
            if (!pet.isNew()) {
                Long compId = pet.getId();
                if (compId.equals(id)) {
                    return pet;
                }
            }
        }
        return null;
    }

    public Pet getPet(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Pet pet : getPets()) {
            if (!ignoreNew || !pet.isNew()) {
                String compName = pet.getName();
                compName = compName == null ? "" : compName.toLowerCase();
                if (compName.equals(name)) {
                    return pet;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("name", this.name)
                .append("address", this.address)
                .append("city", this.city)
                .append("cellphone", this.cellphone)
                .toString();
    }

    public Owner addVisit(Long petId, Visit visit) {

        Assert.notNull(petId, "Pet identifier must not be null!");
        Assert.notNull(visit, "Visit must not be null!");

        Pet pet = getPet(petId);

        Assert.notNull(pet, "Invalid Pet identifier!");

        pet.addVisit(visit);

        return this;
    }

}