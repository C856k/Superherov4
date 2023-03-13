package com.example.superhero_v4.controllers;

import com.example.superhero_v4.Services.SuperheltService;
import com.example.superhero_v4.model.Superhelt;
import com.example.superhero_v4.repositories.IRepository_DB;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/superhelt")

public class SuperheltController {

    /*IRepository_DB SuperheltRepository;
    public SuperheltController(ApplicationContext context, @Value("${Superhelt.reporsitory.impl}") String impl) {
        SuperheltRepository = (IRepository_DB) context.getBean(impl);
    }

     */

    private SuperheltService superheltService;

    public SuperheltController(SuperheltService superheltService) {
        this.superheltService = superheltService;
    }
    @GetMapping(path = "/")
    public ResponseEntity<List<Superhelt>> getSuperheroes() {
        List superheroList = superheltService.getSuperheroes();
        return new ResponseEntity<List<Superhelt>>(superheroList, HttpStatus.OK);
    }
    @PostMapping(path = "/superpower/count/{heroname}")
    public ResponseEntity<Superhelt> postSuperheroes(@RequestBody Superhelt superhelt){
        Superhelt returnSuperhelt = superheltService.postSuperheroes(superhelt);
        return new ResponseEntity<Superhelt>(returnSuperhelt,HttpStatus.OK);
    }
    @PutMapping(path = "/superpower/")
    public ResponseEntity<Superhelt> putSuperheroes(@RequestBody Superhelt superhelt) {
        Superhelt returnSuperhelt = superheltService.putSuperheroes(superhelt);
        return new ResponseEntity<Superhelt>(returnSuperhelt,HttpStatus.OK);
    }
 /*   (path = "/city/")
    public void getCityByName(@PathVariable("city")String city){
        superheltService.getCityByName(city);
    }*/
}
