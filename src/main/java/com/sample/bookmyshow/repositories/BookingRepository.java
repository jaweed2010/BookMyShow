package com.sample.bookmyshow.repositories;

import com.sample.bookmyshow.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    Booking save(Booking booking);
}
