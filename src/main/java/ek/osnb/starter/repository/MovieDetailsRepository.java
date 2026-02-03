package ek.osnb.starter.repository;

import ek.osnb.starter.model.MovieDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Long> {
}
