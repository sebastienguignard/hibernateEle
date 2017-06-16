/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.dao;

import com.aifcc.formation.core.entitys.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Laurent
 */
public class JdbcFilmDao implements FilmDaoInterface {
    private String driverClassName;

    private final int TITLE = 1;
    private final int COPIES = 2;
    private final int MOVIE_TYPE = 3;


    public JdbcFilmDao(String driverClassName) {
       this.driverClassName = driverClassName ;
    }

    @Override
    public void save(Film film)  {
        Connection con = null;
        try {
            Class.forName(driverClassName).newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video", "root", "");
            PreparedStatement statement = con.prepareStatement("INSERT INTO MOVIE (TITLE, COPIES, MOVIE_TYPE) value (?,?,?)");
            statement.setString(TITLE, film.getTitre());
            statement.setInt(COPIES, film.getNbExemplaires());
            statement.setString(MOVIE_TYPE, film.getGenre());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JdbcFilmDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException e) {
            Logger.getLogger(JdbcFilmDao.class.getName()).log(Level.SEVERE, null, e);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (con != null) con.close();
                System.out.println("Connexion fermée");
            }
            catch (Exception e){
                e.printStackTrace();
            }
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


    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
