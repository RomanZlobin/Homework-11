package ru.netology.managers;

import ru.netology.domain.Affiche;


public class FilmManager {
    private Affiche[] movies = new Affiche[0];

    private int resultLength;

    public FilmManager() {
        resultLength = 10;
    }

    public FilmManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(Affiche movie) {
        int length = movies.length + 1;
        Affiche[] tmp = new Affiche[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Affiche[] findAll() {
        return movies;
    }

    public Affiche[] findLast() {
        Affiche[] result;
        if (resultLength < movies.length) {
            result = new Affiche[resultLength];
        } else {
            result = new Affiche[movies.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
