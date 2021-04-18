package ru.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Building {
    @Id
    @GeneratedValue
    private Long id;

    private Double longitude; // долгота здания
    private Double latitude; // широта здания (на всякий пока, чтобы отображать на карте)

    private Long ownerId; // владелец здания (Кфу, например, или какой-нибудь мгу)

    @OneToOne(cascade = CascadeType.ALL)
    private Audience audience;

}
