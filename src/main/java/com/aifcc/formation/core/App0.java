package com.aifcc.formation.core;

import com.aifcc.formation.core.controller.DefaultFilmController;
import com.aifcc.formation.core.util.HibernateUtil;

/**
 * Created by Laurent on 15/02/2017.
 */
public class App0 {

    public static void main(String arg[]){
        HibernateUtil.getSessionFactory();
        DefaultFilmController controller = new DefaultFilmController();
        controller.registerFilmFromConsoleInput();
    }
}
