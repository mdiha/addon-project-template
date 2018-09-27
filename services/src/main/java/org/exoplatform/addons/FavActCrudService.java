package org.exoplatform.addons;

import org.exoplatform.dao.jpa.FavouriteActivityDAOImpl;
import org.exoplatform.entity.FavouriteActivityEntity;
import org.picocontainer.Startable;


public class FavActCrudService implements Startable {
    FavouriteActivityDAOImpl favactentityimpl = new FavouriteActivityDAOImpl();
    FavouriteActivityEntity favActEntity = new FavouriteActivityEntity("comment");

    @Override
    public void start() {
        favactentityimpl.create(favActEntity);
    }

    @Override
    public void stop() {

    }
}
