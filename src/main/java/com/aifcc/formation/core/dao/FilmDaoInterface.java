package com.aifcc.formation.core.dao;

import com.aifcc.formation.core.entitys.Film;

import java.util.List;

/**
 * Created by Laurent on 15/06/2017.
 */
public interface FilmDaoInterface {

    public void save(Film film);

    public Film getFilmById(int id);

    public List<Film> list();
}

