package byngs.k.cicd.owner.application.service;

import byngs.k.cicd.owner.application.input.OwnerUseCase;
import byngs.k.cicd.owner.application.output.OwnerLoadPort;
import byngs.k.cicd.owner.domain.Owner;
import byngs.k.cicd.owner.domain.dto.OwnerResponse;
import byngs.k.cicd.owner.domain.mapper.OwnerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OwnerService implements OwnerUseCase {

    private final OwnerLoadPort ownerLoadPort;

    @Transactional(readOnly = true)
    @Override
    public List<OwnerResponse> findOwners() {
        return ownerLoadPort.findOwners()
                .stream()
                .map(OwnerMapper::mapToDomainEntity)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public OwnerResponse findOwnerById(Long id) {
        Owner owner = ownerLoadPort.findById(id);

        return OwnerMapper.mapToDomainEntity(owner);
    }

    @Transactional(readOnly = true)
    @Override
    public OwnerResponse findOwnerByName(String name) {
        Owner owner = ownerLoadPort.findByName(name);

        return OwnerMapper.mapToDomainEntity(owner);
    }
}
