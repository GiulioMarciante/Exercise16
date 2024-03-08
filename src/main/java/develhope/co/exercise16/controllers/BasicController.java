package develhope.co.exercise16.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("")
    public LocalDateTime getTime(){
        return LocalDateTime.now();
    }
}
