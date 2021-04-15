package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Book {

    @Id
    private Long id;

    private Long userId; // возможно String username; // (кто бронирует)

    private BookType type; // цель бронирования

    private Date date; // время и дата бронирования

    private Audience audience; // аудитория

}
