package com.meilleurtaux.perso.configuration.repository;

import com.meilleurtaux.perso.models.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie findByName(String name);
    Movie findByDirector(String director);
    
}