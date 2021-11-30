package com.reservaya.reservams.repositories;
import com.reservaya.reservams.models.Pasadia;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PasadiaRepository extends MongoRepository <Pasadia,String> {

    @Override
    List<Pasadia> findAll();
}
