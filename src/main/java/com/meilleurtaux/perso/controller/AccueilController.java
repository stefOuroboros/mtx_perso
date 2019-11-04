package com.meilleurtaux.perso.controller;

import com.meilleurtaux.perso.configuration.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/accueil")
public class AccueilController {

    @Autowired private MovieRepository movieRepo;

    @GetMapping
    public ModelAndView afficherAccueil() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("accueil");
        mv.addObject("getAllMovies", movieRepo.findAll());
        return mv;
    }
}