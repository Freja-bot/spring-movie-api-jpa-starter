package ek.osnb.starter.config;

import ek.osnb.starter.model.Actor;
import ek.osnb.starter.model.Movie;
import ek.osnb.starter.repository.ActorRepository;
import ek.osnb.starter.repository.MovieRepository;
import ek.osnb.starter.service.ActorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitializeData implements CommandLineRunner {
    private final ActorRepository actorRepository;
    private final MovieRepository movieRepository;

    public InitializeData(ActorRepository actorRepository, MovieRepository movieRepository, ActorService actorService) {
        this.actorRepository = actorRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        var m1 = new Movie("The Shawshank Redemption", 1994, "Drama");
        var m2 = new Movie("The Godfather", 1972, "Crime");
        var m3 = new Movie("The Dark Knight", 2008, "Action");
        var m4 = new Movie("Pulp Fiction", 1994, "Crime");
        var m5 = new Movie("Forrest Gump", 1994, "Drama");
        var m6 = new Movie("Inception", 2010, "Sci-Fi");
        var m7 = new Movie("The Matrix", 1999, "Sci-Fi");
        var m8 = new Movie("Fight Club", 1999, "Drama");
        var m9 = new Movie("The Lord of the Rings: The Return of the King", 2003, "Fantasy");
        var m10 = new Movie("Interstellar", 2014, "Sci-Fi");
        movieRepository.saveAll(Set.of(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10));

        var a1 = new Actor("Robert De Niro", 1943);
        var a2 = new Actor("Al Pacino", 1940);
        var a3 = new Actor("Leonardo DiCaprio", 1974);
        var a4 = new Actor("Morgan Freeman", 1937);
        var a5 = new Actor("Brad Pitt", 1963);
        var a6 = new Actor("Tom Hanks", 1956);
        var a7 = new Actor("Johnny Depp", 1963);
        var a8 = new Actor("Christian Bale", 1974);
        var a9 = new Actor("Samuel L. Jackson", 1948);
        var a10 = new Actor("Kate Winslet", 1975);
        actorRepository.saveAll(Set.of(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10));
    }
}
