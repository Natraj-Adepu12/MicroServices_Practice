package com.natraj.rating.controller;

import com.natraj.rating.entiities.Rating;
import com.natraj.rating.services.RatingService;
import com.natraj.rating.services.impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    //create rating Api
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //creating get all Api
    @GetMapping
    public ResponseEntity<List<Rating>>  getRatings() {

        return ResponseEntity.ok(ratingService.getRatings());
    }

    //creating  get all ratings by UserId API

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserID(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserID(userId));
    }

    //creating get all ratings by hotelId by API
    @GetMapping("/hotels/{hotelId}")
     public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
     }
}
