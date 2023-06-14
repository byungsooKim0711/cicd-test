package byngs.k.cicd.owner.adapter.rest;

import byngs.k.cicd.owner.application.input.OwnerUseCase;
import byngs.k.cicd.owner.domain.dto.OwnerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OwnerController {

    private final OwnerUseCase ownerUseCase;

    @GetMapping("/owner")
    public List<OwnerResponse> findOwners() {
        return ownerUseCase.findOwners();
    }

    @GetMapping("/owner/{ownerId}")
    public OwnerResponse findOwnerById(@PathVariable Long ownerId) {
        return ownerUseCase.findOwnerById(ownerId);
    }
}
