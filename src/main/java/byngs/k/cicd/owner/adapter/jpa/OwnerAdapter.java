package byngs.k.cicd.owner.adapter.jpa;

import byngs.k.cicd.owner.application.output.OwnerLoadPort;
import byngs.k.cicd.owner.domain.Owner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class OwnerAdapter implements OwnerLoadPort {

    private final OwnerRepository ownerRepository;

    @Override
    public List<Owner> findOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not exists owner id: " + id));
    }

    @Override
    public Owner findByName(String name) {
        return ownerRepository.findOwnerByName(name)
                .orElseThrow(() -> new RuntimeException("Not exists owner name: " + name));
    }
}
