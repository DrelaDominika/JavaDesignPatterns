package com.java.designpatterns.prototype;

import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException{
	    Movie movies = new Movie();
	    movies.loadDefaultMovieList();

	    Movie morningMovies = (Movie) movies.clone();
        List<String> morningMovieList = morningMovies.getDefaultMoviesList();
        morningMovieList.add("Morbius");

        Movie nightMovies = (Movie) movies.clone();
        List<String> nightMovieList = nightMovies.getDefaultMoviesList();
        nightMovieList.remove("Halloween");

        System.out.println("Default movie list "+ movies.getDefaultMoviesList());
        System.out.println("Morning movie list "+ morningMovies.getDefaultMoviesList());
        System.out.println("Night movie list "+ nightMovies.getDefaultMoviesList());
        System.out.println("Default movie list "+ movies.getDefaultMoviesList());
    }
}
