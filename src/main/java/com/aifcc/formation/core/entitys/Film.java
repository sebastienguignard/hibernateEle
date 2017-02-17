/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.entitys;

import java.util.Set;

/**
 *
 * @author Laurent
 */
public class Film {
    private Integer id;
    private String titre ;
    private String genre ;
    private Integer nbExemplaires ;
    private Actor acteurPrincipal ;
    private Set<Actor> acteursSecondaires;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    public Actor getActeurPrincipal() {
        return acteurPrincipal;
    }
    public void setActeurPrincipal(Actor acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }
    public Set<Actor> getActeursSecondaires() {
        return acteursSecondaires;
    }
    public void setActeursSecondaires(Set<Actor> acteursSecondaires) {
        this.acteursSecondaires = acteursSecondaires;
    }



    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", genre='" + genre + '\'' +
                ", nbExemplaires=" + nbExemplaires +
                '}';
    }
}
