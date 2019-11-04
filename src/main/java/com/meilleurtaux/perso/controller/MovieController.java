package com.meilleurtaux.perso.controller;

import java.util.List;

import com.meilleurtaux.perso.configuration.repository.MovieRepository;
import com.meilleurtaux.perso.models.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepo;

    @GetMapping
    public List<Movie> getAllMovies(){
        return  movieRepo.findAll();
    }

    @PostMapping(path="/new", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createMovie(@RequestBody Movie fMovie) {
        Movie newMovie = new Movie(fMovie);
        movieRepo.save(newMovie);   
    }

}