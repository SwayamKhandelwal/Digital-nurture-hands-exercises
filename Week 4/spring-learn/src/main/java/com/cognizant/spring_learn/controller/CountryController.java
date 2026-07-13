package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.SpringLearnApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CountryController {

    @GetMapping("/country")
    public String getCountryIndia(){
        return SpringLearnApplication.displayCountry();
    }

    @GetMapping("/countries/{code}")
    public String getCountry(@PathVariable String code){
        return
    }
}
