package ru.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Timetable {

    @Id
    @GeneratedValue
    private Long id;

    private Long ownerId; // владелец расписания (кфу, мгу и тд)

    @OneToMany(mappedBy = "timetable", cascade = CascadeType.ALL)
    private List<Book> books; // список бронирований
}
