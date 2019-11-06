package com.meilleurtaux.perso.controller;

import java.util.List;

import com.meilleurtaux.perso.configuration.repository.MovieRepository;
import com.meilleurtaux.perso.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepo;

    @GetMapping
    public List<Movie> getAllMovies(){
        return  movieRepo.findAll();
    }

    @GetMapping("/{name}")
    public Movie getMovieByName(@PathVariable String name) {
        return movieRepo.findByName(name);
    }

    @PostMapping("/new")
	public void createMovie(@RequestBody Movie movieForm) {
        movieRepo.save(movieForm);
    }

    @DeleteMapping(path="/delete/{name}") 
	 public void deleteMovie (@PathVariable String name) {
		movieRepo.delete(this.movieRepo.findByName(name));
	}

    @PatchMapping(path="/edit/{name}")
    public Movie editMovie (@PathVariable String name, @RequestBody Movie movieForm) {
        Movie movieToUpdate = this.movieRepo.findByName(name);
        movieToUpdate.setName(movieForm.getName());
        movieToUpdate.setDirector(movieForm.getDirector());
        movieToUpdate.setPoster(movieForm.getPoster());
        return movieRepo.save(movieToUpdate);
    }    
}