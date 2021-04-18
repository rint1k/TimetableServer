package ru.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "books")
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

//    private Long userId; // возможно String username; // (кто бронирует)
    private String username;

    private BookType type; // цель бронирования

    private Date date; // время и дата бронирования

    @ManyToOne
    @JoinColumn(name = "audience_id")
    private Audience audience; // аудитория

    @ManyToOne
    @JoinColumn(name = "timetable_id")
    private Timetable timetable;

}
