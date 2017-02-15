/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aifcc.formation.core;


import com.aifcc.formation.core.controller.DefaultFilmController;

/**
 *
 * @author Laurent
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultFilmController controller = new DefaultFilmController();
        controller.registerFilmFromConsoleInput();
    }
    
}
