package com.aifcc.formation.core.dao;

import com.aifcc.formation.core.entitys.Film;
import com.aifcc.formation.core.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by Laurent on 16/02/2017.
 */
public class HibernateFilmDao {



    public void save(Film film){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(film);
            session.getTransaction().commit();
        }
        catch (HibernateException hbExc){
            hbExc.printStackTrace();
            try {
                session.getTransaction().rollback();
            }
            catch (HibernateException exc){
                exc.printStackTrace();
            }
        }
        finally {
            if(session != null){
                try{
                    session.close();
                }
                catch (Exception exc){
                    exc.printStackTrace();
                }
            }

        }
    }

    public Film getById(int id){
        Film filmId = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            filmId = (Film) session.get(Film.class,id);
            //Redéclanche une requete pour recuperer l'acteur principal du film
            Hibernate.initialize(filmId.getActeurPrincipal());
            //Redéclanche un requete pour recuperer la liste des acteur secondaires
            Hibernate.initialize(filmId.getActeursSecondaires());

            session.getTransaction().commit();
        }
        catch (HibernateException hbExc){
            hbExc.printStackTrace();
            try {
                session.getTransaction().rollback();
            }
            catch (HibernateException exc){
                exc.printStackTrace();
            }
        }
        finally {
            if(session != null){
                try{
                    session.close();
                }
                catch (Exception exc){
                    exc.printStackTrace();
                }
            }

        }
        return filmId ;
    }


}
