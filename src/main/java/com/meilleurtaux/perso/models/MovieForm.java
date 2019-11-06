package com.meilleurtaux.perso.models;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public class MovieForm {
    private String name;
    private String director;
    private String poster;


    public MovieForm(String name, String director, String poster) {
        super();
        this.name = name;
        this.director = director;
        this.poster = poster;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name;}

    public String getDirector() { return this.director; }
    public void setDirector(String director) { this.director = director;}

    public String getPoster() { return this.poster; }
    public void setPoster(String poster) { this.poster = poster; }

}