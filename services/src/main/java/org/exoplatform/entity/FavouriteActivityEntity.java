package org.exoplatform.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;


import javax.persistence.*;
import java.util.Calendar;

@Entity
@ExoEntity
@Table(name = "FavActEntity")
public class FavouriteActivityEntity {

    public Long getID() {
        return ID;
    }

    @Id
    @GeneratedValue
    @Column(name = "FavActEntity_ID")
    private Long ID;

    @Column(name = "ACTIVITY_TITLE")
    private String activityTitle;

    @Transient
    @Column(name = "FAVORITED_DATE")
    private Calendar favDate;

    @Column(name = "ACTIVITY_ID")
    private Long activityEntity;

    public FavouriteActivityEntity (String activtitle){
        activityTitle =activtitle;

    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public Calendar getFavDate() {
        return favDate;
    }

    public Long getActivityEntity() {
        return activityEntity;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public void setFavDate(Calendar favDate) {
        this.favDate = favDate;
    }

    public void setActivityEntity(Long activityEntity) {
        this.activityEntity = activityEntity;
    }
}
