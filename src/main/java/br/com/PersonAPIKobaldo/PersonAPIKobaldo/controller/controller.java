package br.com.PersonAPIKobaldo.PersonAPIKobaldo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class controller {
    @GetMapping
    public String getPeople(){
        return "Whatsuuuuup";
    }

}
