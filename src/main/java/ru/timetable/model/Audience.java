package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Audience {

    @Id
    private Long id;

    private Integer room; // номер кабинета

    private Integer floor; // этаж кабинета

    // many to many
    private List<Tool> tools = new ArrayList<>();

    private Integer seatCapacity; // сколько сидячих мест

    // one to one
    private Building building; // к какому зданию относится

    @Column(length = 4000)
    private String description; // информация о аудитории, какой-нибудь комментарий (например, что-то сломано и т.д)

    private AudienceStatus status;
}