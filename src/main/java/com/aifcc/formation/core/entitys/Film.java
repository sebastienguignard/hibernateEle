/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.entitys;

/**
 *
 * @author Laurent
 */
public class Film {
    private String titre ;
    private String genre ;
    private Integer nbExemplaires ;

    
    
    
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNbExemplaires() {
        return nbExemplaires;
    }

    public void setNbExemplaires(Integer nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    @Override
    public String toString() {
        return titre+";"+genre+";"+String.valueOf(nbExemplaires) ;
    }
    
    
    
    
}
