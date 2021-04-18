package ru.timetable.repository;
import ru.timetable.model.Audience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceRepository extends JpaRepository<Audience, Long>{
}
