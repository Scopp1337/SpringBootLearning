package school.sorokin.reservation.controller.dto;


import school.sorokin.reservation.enums.AvailabilityStatus;

public record CheckAvailabilityResponse(
        String message,
        AvailabilityStatus status
) {
}
