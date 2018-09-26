package org.exoplatform.addons.dao.jpa;

import org.exoplatform.addons.dao.FavouriteActivityDAO;
import org.exoplatform.addons.entity.FavouriteActivityEntity;
import org.exoplatform.commons.persistence.impl.GenericDAOJPAImpl;

import java.util.List;

public class FavouriteActivityDAOImpl extends GenericDAOJPAImpl<FavouriteActivityEntity, Long> implements FavouriteActivityDAO {


    @Override
    public Long count() {
        return super.count();
    }

    @Override
    public FavouriteActivityEntity find(Long aLong) {
        return super.find(aLong);
    }

    @Override
    public List<FavouriteActivityEntity> findAll() {
        return super.findAll();
    }

    @Override
    public FavouriteActivityEntity create(FavouriteActivityEntity favouriteActivityEntity) {
        return super.create(favouriteActivityEntity);
    }

    @Override
    public void createAll(List<FavouriteActivityEntity> list) {

    }

    @Override
    public FavouriteActivityEntity update(FavouriteActivityEntity favouriteActivityEntity) {
        return super.update(favouriteActivityEntity)
    }

    @Override
    public void updateAll(List<FavouriteActivityEntity> list) {

    }

    @Override
    public void delete(FavouriteActivityEntity favouriteActivityEntity) {

    }

    @Override
    public void deleteAll(List<FavouriteActivityEntity> list) {

    }

    @Override
    public void deleteAll() {

    }
}
