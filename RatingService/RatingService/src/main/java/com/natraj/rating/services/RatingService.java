package com.natraj.rating.services;

import com.natraj.rating.entiities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by userId
    List<Rating> getRatingByUserID(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
