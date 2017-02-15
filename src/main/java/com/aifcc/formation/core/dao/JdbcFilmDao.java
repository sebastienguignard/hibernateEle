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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurent
 */
public class JdbcFilmDao {
    
    private Connection con = null ;
    private final int TITLE = 1 ;
    private final int COPIES = 2 ;
    private final int MOVIE_TYPE = 3 ;
    
    public JdbcFilmDao(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video", "root","");
            System.out.println("Connexion OK");
        } catch (Throwable ex) {
            Logger.getLogger(JdbcFilmDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connexion NOK");
   
        }
    }
    
    public void save(Film film){
        try {
            PreparedStatement statement =  con.prepareStatement("INSERT INTO MOVIE (TITLE, COPIES, MOVIE_TYPE) value (?,?,?)");
            statement.setString(TITLE, film.getTitre());
            statement.setInt(COPIES, film.getNbExemplaires());
            statement.setString(MOVIE_TYPE, film.getGenre());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JdbcFilmDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void closeConnection(){
         try {
                if(con != null) con.close();
                System.out.println("Connexion fermée");
            } catch (SQLException e) {
                Logger.getLogger(JdbcFilmDao.class.getName()).log(Level.SEVERE, null, e);
            }
    }
    
    
}
