package school.sorokin.reservation.service;


import org.springframework.stereotype.Component;
import school.sorokin.reservation.controller.dto.Reservation;
import school.sorokin.reservation.repository.entity.ReservationEntity;

@Component
public class ReservationMapper {

    public Reservation toDomain(
            ReservationEntity reservation
    ) {
        return new Reservation(
                reservation.getId(),
                reservation.getUserId(),
                reservation.getRoomId(),
                reservation.getStartDate(),
                reservation.getEndDate(),
                reservation.getStatus()
        );
    }

    public ReservationEntity toEntity(
            Reservation reservation
    ) {
        return new ReservationEntity(
                reservation.id(),
                reservation.userId(),
                reservation.roomId(),
                reservation.startDate(),
                reservation.endDate(),
                reservation.status()
        );
    }
}
