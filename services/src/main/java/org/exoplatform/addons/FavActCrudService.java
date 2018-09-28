package org.exoplatform.addons;

import org.exoplatform.dao.jpa.FavouriteActivityDAOImpl;
import org.exoplatform.entity.FavouriteActivityEntity;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.picocontainer.Startable;


public class FavActCrudService implements Startable {
    private static final Log LOG = ExoLogger.getLogger(FavActCrudService.class);
    FavouriteActivityDAOImpl favactentityimpl = new FavouriteActivityDAOImpl();
    FavouriteActivityEntity favActEntity = new FavouriteActivityEntity("comment");


    @Override
    public void start() {
        //favactentityimpl.create(favActEntity);
        //LOG.info("Nbr favactEntity: "+favactentityimpl.count());
        //String com;
        //FavouriteActivityEntity favActEntity1;
        //favActEntity1 = (FavouriteActivityEntity) favactentityimpl.find((long) 1);
        //com = favActEntity1.getActivityTitle();
        //LOG.info("FIRST FavActEntity TITLE: "+com);



    }

    @Override
    public void stop() {

    }
}
