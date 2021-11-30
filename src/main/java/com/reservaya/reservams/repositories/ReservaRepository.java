package com.reservaya.reservams.repositories;
import com.reservaya.reservams.models.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaRepository extends MongoRepository <Reserva,String>{

    @Override
    List<Reserva> findAll();
}
