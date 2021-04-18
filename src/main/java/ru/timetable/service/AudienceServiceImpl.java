package ru.timetable.service;

import ru.timetable.model.Audience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.timetable.repository.AudienceRepository;

@Service
public class AudienceServiceImpl implements AudienceService {
    @Autowired
    private AudienceRepository audienceRepository;


    @Override
    public Audience getAudience(Long id) {
        return new Audience();
    }
}
