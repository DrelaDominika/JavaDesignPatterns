package com.java.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Cloneable {
    private List<String> defaultMoviesList;

    public Movie() {
        this.defaultMoviesList = new ArrayList<String>();
    }

    public Movie(List<String> list) {
        this.defaultMoviesList = list;
    }

    public void loadDefaultMovieList() {
        defaultMoviesList.add("Toy Story");
        defaultMoviesList.add("It");
        defaultMoviesList.add("Aquaman");
        defaultMoviesList.add("Halloween");
    }

    public List<String> getDefaultMoviesList() {
        return defaultMoviesList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getDefaultMoviesList()) {
            temp.add(s);
        }
        return new Movie(temp);
    }
}
