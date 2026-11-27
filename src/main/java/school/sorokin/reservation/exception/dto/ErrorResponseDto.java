package school.sorokin.reservation.exception.dto;

import java.time.LocalDateTime;

public record ErrorResponseDto(
        String message,
        String detailMessage, // errorMessage
        LocalDateTime errorTime
) {
}
