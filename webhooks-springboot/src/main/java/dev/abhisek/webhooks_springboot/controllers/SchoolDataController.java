package dev.abhisek.webhooks_springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.abhisek.webhooks_springboot.entities.SchoolData;
import dev.abhisek.webhooks_springboot.services.SchoolDataService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/demo")
@RequiredArgsConstructor
public class SchoolDataController {

    private final SchoolDataService service;

    @PostMapping("/addNewSchool")
    public @ResponseBody String addNewSchool(@RequestParam String schoolName) {
        SchoolData school = service.createNewSchool(schoolName);
        return school.getSchoolName();
    }

}
