package com.sample.H2.controller;


import com.sample.H2.dao.PersonInformationService;
import com.sample.H2.model.PersonInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personinformation")
public class PersonInformationController {

    @Autowired
    private PersonInformationService personInformationService;

    @GetMapping(value = "/Testall")
    public List<PersonInformation> findAll(){
        List<PersonInformation> personInformations = personInformationService.findAll();
        return personInformations;
    }

    @GetMapping(value = "/{name}")
    public PersonInformation findByName(@PathVariable final String name){
      PersonInformation personInformation = personInformationService.findByName(name);
      return personInformation;
    }

    }

