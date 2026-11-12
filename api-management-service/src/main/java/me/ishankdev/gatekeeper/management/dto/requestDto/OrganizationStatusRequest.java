package me.ishankdev.gatekeeper.management.dto.requestDto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import me.ishankdev.gatekeeper.management.entity.OrganizationStatus;

@Getter
@Setter
public class OrganizationStatusRequest {

    @NotNull
    private OrganizationStatus status;
}
