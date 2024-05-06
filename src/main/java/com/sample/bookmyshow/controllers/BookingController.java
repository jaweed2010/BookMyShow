package com.sample.bookmyshow.controllers;

import com.sample.bookmyshow.dto.BookMovieRequestDto;
import com.sample.bookmyshow.dto.BookMovieResponseDto;
import com.sample.bookmyshow.models.Booking;
import com.sample.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;
    @Autowired
    BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }
    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto){
        bookingService.bookMovie(
                bookMovieRequestDto.getUserId(),
                bookMovieRequestDto.getShowId(),
                bookMovieRequestDto.getShowSeatIds()
        );
        return  null;
    }


}
