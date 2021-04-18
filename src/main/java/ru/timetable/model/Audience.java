package ru.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "audience")
public class Audience implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Integer room; // номер кабинета

    private Integer floor; // этаж кабинета

    // many to many
    @OneToMany(mappedBy = "audience", cascade = CascadeType.ALL)
    private List<Tool> tools;

    private Integer seatCapacity; // сколько сидячих мест

    // one to one
    @OneToOne(mappedBy = "audience")
    private Building building; // к какому зданию относится

    @Column(length = 4000)
    private String description; // информация о аудитории, какой-нибудь комментарий (например, что-то сломано и т.д)

    private AudienceStatus status;

    @OneToMany(mappedBy="audience", cascade = CascadeType.ALL)
    private List<Book> books;
}