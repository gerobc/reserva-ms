package com.reservaya.reservams.controllers;

import com.reservaya.reservams.exceptions.PasadiaNotFoundException;
import com.reservaya.reservams.models.Reserva;
import com.reservaya.reservams.repositories.ReservaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservaController {
    private final ReservaRepository reservaRepository;
    public ReservaController(ReservaRepository reservaRepository){this.reservaRepository = reservaRepository;
    }

    @GetMapping("/reserva/{idres}")
    Reserva getReserva(@PathVariable String idres){
        return reservaRepository.findById(idres)
                .orElseThrow(()-> new PasadiaNotFoundException("No se encontró un pasadia con este número: "+ idres));
    }

    @PostMapping("/reserva")



    Reserva newPasadia(@RequestBody Reserva pasadia){
        return reservaRepository.save(pasadia);
    }

}
