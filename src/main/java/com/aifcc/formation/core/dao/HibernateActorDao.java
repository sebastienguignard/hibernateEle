package com.aifcc.formation.core.dao;

import com.aifcc.formation.core.entitys.Actor;
import com.aifcc.formation.core.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by Laurent on 17/02/2017.
 */
public class HibernateActorDao {


    public void save(Actor acteur){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(acteur);
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

    public Actor getById(int id){
        Actor acteur = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            acteur = (Actor) session.get(Actor.class,id);
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
        return acteur ;
    }

}
