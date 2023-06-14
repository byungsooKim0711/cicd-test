package byngs.k.cicd.owner.application.output;

import byngs.k.cicd.owner.domain.Owner;

import java.util.List;

public interface OwnerLoadPort {

    List<Owner> findOwners();

    Owner findById(Long id);

    Owner findByName(String name);
}
