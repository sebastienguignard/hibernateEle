/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.service;

import com.aifcc.formation.core.dao.FilmDaoInterface;
import com.aifcc.formation.core.dao.HibernateFilmDao;
import com.aifcc.formation.core.dao.JdbcFilmDao;
import com.aifcc.formation.core.entitys.Film;

/**
 *
 * @author Laurent
 */
public class FilmService implements FilmServiceInterface{

    private FilmDaoInterface dao ;

    public FilmService(FilmDaoInterface dao){
        this.dao = dao ;
    }

    @Override
    public void registerFilm(Film film){
        dao.save(film);
    }

    @Override
    public Film getFilmToDescripte(int id){
        return dao.getFilmById(id);
    }

    public FilmDaoInterface getDao() {
        return dao;
    }

    public void setDao(FilmDaoInterface dao) {
        this.dao = dao;
    }
}
