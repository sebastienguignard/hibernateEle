package com.aifcc.formation.core.service;

import com.aifcc.formation.core.dao.HibernateActorDao;
import com.aifcc.formation.core.entitys.Actor;

/**
 * Created by Laurent on 17/02/2017.
 */
public class ActorService {

    public void registerActor(Actor acteur){
        HibernateActorDao jdbc = new HibernateActorDao();
        jdbc.save(acteur);
    }

    public Actor getActorToDescripte(int id){
        HibernateActorDao jdbc = new HibernateActorDao();
        return jdbc.getById(id);
    }
}
