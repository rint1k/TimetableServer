package ru.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tool {

    @Id
    @GeneratedValue
    private Long id;

    private String description; // информация о инвентаре (состояние, комментарий)

    private ToolType toolType; // что за инструмент (проектор/доска/маникен для бжд)

    @ManyToOne
    @JoinColumn(name = "audience_id")
    private Audience audience;

}
