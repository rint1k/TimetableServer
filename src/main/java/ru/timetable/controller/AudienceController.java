package ru.timetable.controller;

import ru.timetable.model.Audience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.timetable.service.AudienceService;

@RestController
public class AudienceController {

    @Autowired
    private AudienceService audienceService;

    @GetMapping("/au")
    private ResponseEntity<Audience> getAudience() {
        return new ResponseEntity<>(audienceService.getAudience(1L), HttpStatus.OK);
    }
}
