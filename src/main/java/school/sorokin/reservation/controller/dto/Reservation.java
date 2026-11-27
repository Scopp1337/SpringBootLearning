package school.sorokin.reservation.controller.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import school.sorokin.reservation.enums.ReservationStatus;

import java.time.LocalDate;

public record Reservation(
        @Null
        Long id,

        @NotNull
        Long userId,

        @NotNull
        Long roomId,

        @FutureOrPresent
        @NotNull
        LocalDate startDate,

        @FutureOrPresent
        @NotNull
        LocalDate endDate,

        ReservationStatus status
) {
}
