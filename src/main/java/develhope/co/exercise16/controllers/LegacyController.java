package develhope.co.exercise16.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    @GetMapping("")
    public String printWord(){
        return "This is old code";
    }
}
