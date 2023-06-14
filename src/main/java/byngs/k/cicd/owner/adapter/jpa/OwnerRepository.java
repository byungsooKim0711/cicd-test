package byngs.k.cicd.owner.adapter.jpa;

import byngs.k.cicd.owner.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findOwnerByName(String name);
}
