package com.sample.bookmyshow.repositories;

import com.sample.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show,Long> {
    @Override
    Optional<Show> findById(Long aLong);
}
