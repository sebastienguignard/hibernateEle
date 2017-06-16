package com.aifcc.formation.core;

import com.aifcc.formation.core.controller.DefaultFilmController;
import com.aifcc.formation.core.util.HibernateUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Laurent on 15/02/2017.
 */
public class App0 {

    public static void main(String arg[]){
        HibernateUtil.getSessionFactory();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DefaultFilmController controller = (DefaultFilmController)context.getBean("filmController");
        controller.descripteFilmWithConsole();
    }
}
