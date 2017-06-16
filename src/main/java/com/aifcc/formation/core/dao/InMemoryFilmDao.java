package com.aifcc.formation.core.dao;

import com.aifcc.formation.core.entitys.Film;

import java.util.List;
import java.util.Set;

/**
 * Created by Laurent on 16/06/2017.
 */
public class InMemoryFilmDao implements FilmDaoInterface {
    private List<Film> films ;

    @Override
    public void save(Film film) {

    }

    @Override
    public Film getFilmById(int id) {
        return null;
    }

    @Override
    public List<Film> list() {
        return films;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
