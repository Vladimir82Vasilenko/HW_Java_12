package org.example;

import java.util.Arrays;

public class FilmManager {

    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }
    private String[] films = new String[0];

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAllFilms() {
        return films;
    }

    public String[] findLastFilms() {
        int requiredLength;
        if (films.length < limit) {
            requiredLength = films.length;
        } else {
            requiredLength = limit;
        }
        String[] tmp = new String[requiredLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}

