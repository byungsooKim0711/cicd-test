package byngs.k.cicd.owner.domain.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class VisitResponse {

    private Long id;

    private LocalDate visitDate;

    private String description;

    protected VisitResponse(Long id, LocalDate visitDate, String description) {
        this.id = id;
        this.visitDate = visitDate;
        this.description = description;
    }

    public static VisitResponse of(Long id, LocalDate visitDate, String description) {
        return new VisitResponse(id, visitDate, description);
    }
}
