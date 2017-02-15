/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core.controller;

import com.aifcc.formation.core.entitys.Film;
import com.aifcc.formation.core.service.FilmService;
import java.util.Scanner;

/**
 *
 * @author Laurent
 */
public class DefaultFilmController {

    public void registerFilmFromConsoleInput() {
        Film film = new Film();
        FilmService service = new FilmService();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quel est le titre du film ?");
        film.setTitre(scan.nextLine());
        System.out.println("Quel est le genre de ce film ?");
        film.setGenre(scan.nextLine());
        System.out.println("Quel est le nombre d'exemplaires ?");
        film.setNbExemplaires(scan.nextInt());
        

        service.registerFilm(film);
    }
}
