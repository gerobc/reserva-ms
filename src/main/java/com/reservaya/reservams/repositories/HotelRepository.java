package com.reservaya.reservams.repositories;
import com.reservaya.reservams.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface HotelRepository extends MongoRepository <Hotel, String> { }


