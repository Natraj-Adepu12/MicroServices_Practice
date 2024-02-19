package com.natraj.rating.repository;

import com.natraj.rating.entiities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    //custom finder methods by default we don't get these methods,so we have to create it by ourselves.

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
