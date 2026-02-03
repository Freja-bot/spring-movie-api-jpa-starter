package ek.osnb.starter.repository;

import ek.osnb.starter.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
