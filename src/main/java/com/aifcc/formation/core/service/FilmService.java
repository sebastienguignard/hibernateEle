/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.service;

import com.aifcc.formation.core.dao.JdbcFilmDao;
import com.aifcc.formation.core.entitys.Film;

/**
 *
 * @author Laurent
 */
public class FilmService {
    
    public void registerFilm(Film film){
        JdbcFilmDao jdbc = new JdbcFilmDao();
        jdbc.save(film);
        jdbc.closeConnection();
    }
    
}
