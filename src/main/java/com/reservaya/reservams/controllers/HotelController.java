package com.reservaya.reservams.controllers;
import com.reservaya.reservams.exceptions.HoteltNotFoundException;
import com.reservaya.reservams.models.Hotel;
import com.reservaya.reservams.repositories.HotelRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotelController {

    private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotel/{idhotel}")
    Hotel getHotel(@PathVariable String idhotel){
        return hotelRepository.findById(idhotel)
                .orElseThrow(()-> new HoteltNotFoundException("No se encontró una cuenta con el nombre: "+ idhotel));
    }

    @PostMapping("/hotel")
    Hotel newHotel(@RequestBody Hotel hotel){
        return hotelRepository.save(hotel);
    }

}
