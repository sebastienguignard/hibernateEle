package com.aifcc.formation.core.service;

import com.aifcc.formation.core.entitys.Film;

/**
 * Created by Laurent on 15/06/2017.
 */
public interface FilmServiceInterface {

    public void registerFilm(Film film);

    public Film getFilmToDescripte(int id);
}
