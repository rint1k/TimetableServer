package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Timetable {
    private Long id;

    private Long ownerId; // владелец расписания (кфу, мгу и тд)

    // one to many
    private List<Book> book = new ArrayList<>(); // список бронирований
}
