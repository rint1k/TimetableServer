package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tool {

    @Id
    private Long id;

    private String description; // информация о инвентаре (состояние, комментарий)

    private ToolType toolType; // что за инструмент (проектор/доска/маникен для бжд)

}
