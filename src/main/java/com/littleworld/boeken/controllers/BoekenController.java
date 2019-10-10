package com.littleworld.boeken.controllers;

import com.littleworld.boeken.model.Boeken;
import com.littleworld.boeken.service.BoekenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BoekenController {

    @Autowired
    private BoekenService boekenService;

    @PostMapping("/boeken")
    public Boeken create(@RequestBody Boeken boeken) {
        return boekenService.save(boeken);
    }

    @PutMapping("/boeken")
    public Boeken update(@RequestBody Boeken boeken) {
        return boekenService.save(boeken);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping("/boeken/{id}")
    public void delete(@PathVariable  int id) {
        boekenService.deleteById(id);
    }

    @GetMapping("/boeken")
    public List<Boeken> findAll() {
        return (List<Boeken>)boekenService.findAll();
    }


    @GetMapping("/boeken/auteurs/{auteur}")
    public List<Boeken> findAll(@PathVariable String auteur) {
        return (List<Boeken>)boekenService.findByAuteur(auteur);
    }

    @GetMapping("/boeken/titels/{titel}")
    public List<Boeken> findAllTitel(@PathVariable String titel) {
        return (List<Boeken>)boekenService.findByTitel(titel);
    }

    @GetMapping("/boeken/beoordelingen/{beoordeling}")
    public List<Boeken> findAll(@PathVariable int beoordeling){
        return (List<Boeken>)boekenService.findByBeoordeling(beoordeling);
    }


    @GetMapping("/boeken/{id}")
    public Optional<Boeken> todoById(@PathVariable  int id) {
        return boekenService.findById(id);
    }
}