/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.dao;

import com.aifcc.formation.core.entitys.Film;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurent
**/
public class FileFilmDao implements FilmDaoInterface {

    @Override
    public void save (Film film){
        try {
            FileWriter writer = new FileWriter(System.getProperty("user.dir") +"\\Films.txt", true);
            writer.write(film.toFileTxt() + "\r\n");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileFilmDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Film getFilmById(int id) {
        return null;
    }

    @Override
    public List<Film> list() {
        return null;
    }
}
