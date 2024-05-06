package com.sample.bookmyshow.services;

import com.sample.bookmyshow.models.Booking;
import com.sample.bookmyshow.repositories.BookingRepository;
import com.sample.bookmyshow.repositories.ShowRepository;
import com.sample.bookmyshow.repositories.ShowSeatRepository;
import com.sample.bookmyshow.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private BookingRepository bookingRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;

    BookingService(BookingRepository bookingRepository,
                   ShowRepository showRepository,
                   ShowSeatRepository showSeatRepository,
                   UserRepository userRepository){
        this.bookingRepository=bookingRepository;
        this.showRepository=showRepository;
        this.showSeatRepository=showSeatRepository;
        this.userRepository=userRepository;
    }

    public Booking bookMovie(Long userId,
                      Long showId,
                      List<Long> showSeatIds
                      ){
        return null;
    }
}
