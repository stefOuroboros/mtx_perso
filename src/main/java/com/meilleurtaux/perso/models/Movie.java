package com.meilleurtaux.perso.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.meilleurtaux.perso.models.MovieForm;

@Entity
@Table(name = "MOVIE")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME")
    private String name;
    @Column(name="DIRECTOR")
    private String director;
    @Column(name="POSTER")
    private String poster;

    public Movie(String name, String director, String poster){
        this.name = name;
        this.director = director;
        this.poster = poster;
    }
    public Movie() {
		super();
	}
    
    public Movie( Movie formMovie) {
        this.name = formMovie.getName();
        this.director = formMovie.getDirector();
        this.poster = formMovie.getPoster();
	}

	public Movie( MovieForm formMovie) {
        this.name = formMovie.getName();
        this.director = formMovie.getDirector();
        this.poster = formMovie.getPoster();
	}
	/**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return String return the poster
     */
    public String getPoster() {
        return poster;
    }

    /**
     * @param poster the poster to set
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }

}