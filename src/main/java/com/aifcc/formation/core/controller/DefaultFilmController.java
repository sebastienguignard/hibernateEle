/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.controller;

import com.aifcc.formation.core.entitys.Actor;
import com.aifcc.formation.core.entitys.Film;
import com.aifcc.formation.core.service.FilmService;
import com.aifcc.formation.core.service.FilmServiceInterface;

import java.util.Scanner;

/**
 *
 * @author Laurent
 */
public class DefaultFilmController {


    private FilmServiceInterface service ;


    public void registerFilmFromConsoleInput() {
        Film film = new Film();
        Actor acteur = new Actor();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quel est le titre du film ?");
        film.setTitre(scan.nextLine());
        System.out.println("Quel est le genre de ce film ?");
        film.setGenre(scan.nextLine());
        System.out.println("Quel est le nom de l'acteur principal");
        acteur.setNom(scan.nextLine());
        System.out.println("Quel est le prenom de l'acteur principal");
        acteur.setPrenom(scan.nextLine());
        System.out.println("Quel est le nombre d'exemplaires ?");
        film.setNbExemplaires(scan.nextInt());

        film.setActeurPrincipal(acteur);
        service.registerFilm(film);
    }

    public void descripteFilmWithConsole() {
       Scanner scan = new Scanner(System.in);
       int id= 0 ;

        System.out.println("Quel est l'identifiant du film ?");
        id = scan.nextInt();

        Film film = service.getFilmToDescripte(id);
        if(film != null){
            System.out.println(film.toString() + " " + film.getActeurPrincipal().toString());
            System.out.println("Acteurs secondaires : ");
            for (Actor acteur :
                    film.getActeursSecondaires()) {
                System.out.println(acteur.toString());
            }
        }
        else System.out.println("Ce film n'existe pas ...");
    }


    public FilmServiceInterface getService() {
        return service;
    }

    public void setService(FilmServiceInterface service) {
        this.service = service;
    }
}
