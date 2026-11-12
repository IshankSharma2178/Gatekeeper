package me.ishankdev.gatekeeper.management.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.ishankdev.gatekeeper.management.entity.Organization;
import me.ishankdev.gatekeeper.management.entity.OrganizationStatus;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class OrganizationResponse {

    private Long id;
    private String name;
    private String slug;
    private OrganizationStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static OrganizationResponse from(Organization organization) {
        return new OrganizationResponse(organization.getId(),
                organization.getName(),
                organization.getSlug(),
                organization.getStatus(),
                organization.getCreatedAt(),
                organization.getUpdatedAt());
    }
}