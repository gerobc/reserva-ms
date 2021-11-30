package com.reservaya.reservams.controllers;

import com.reservaya.reservams.exceptions.PasadiaNotFoundException;
import com.reservaya.reservams.models.Pasadia;
import com.reservaya.reservams.repositories.PasadiaRepository;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@RestController
public class PasadiaController {

    private final PasadiaRepository pasadiaRepository;
    public PasadiaController(PasadiaRepository pasadiaRepository){
        this.pasadiaRepository = pasadiaRepository;
    }

    @GetMapping("/pasadia/{idpas}")
    Pasadia getPasadia(@PathVariable String idpas){
        return pasadiaRepository.findById(idpas)
                .orElseThrow(()-> new PasadiaNotFoundException("No se encontró un pasadia con este número: "+ idpas));
    }

    @PostMapping("/pasadia")



        Pasadia newPasadia(@RequestBody Pasadia pasadia){
        return pasadiaRepository.save(pasadia);
    }


}