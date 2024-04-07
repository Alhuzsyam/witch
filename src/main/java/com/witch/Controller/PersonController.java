package com.witch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.witch.Dto.Response;
import com.witch.Dto.VictimRequest;
import com.witch.Model.Person;
import com.witch.Service.PersonService;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/victim/average")
    public Response<Object> calculateAverageVictims(@RequestBody VictimRequest request) {
        Person personA = new Person(request.getAgeAtDeathA(), request.getYearOfDeathA());
        Person personB = new Person(request.getAgeAtDeathB(), request.getYearOfDeathB());
        return personService.calculateAverageVictims(personA, personB);
        // 
    }
}

