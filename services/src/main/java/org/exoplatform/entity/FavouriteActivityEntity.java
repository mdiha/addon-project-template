package org.exoplatform.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;
import org.exoplatform.social.core.jpa.storage.entity.ActivityEntity;


import javax.persistence.*;
import java.util.Calendar;

@Entity
@ExoEntity
@Table(name = "FavActEntity")
public class FavouriteActivityEntity {

    @Id
    @GeneratedValue
    @Column(name = "FavActEntity_ID")
    private Long ID;

    @Column(name = "ACTIVITY_TITLE")
    private String activityTitle;

    @Transient
    @Column(name = "FAVORITED_DATE")
    private Calendar favDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTIVITY_ID", nullable = true)
    private ActivityEntity activityEntity;

    public FavouriteActivityEntity() {
    }

    public FavouriteActivityEntity (String title){
        activityTitle =title;

    }

    public Long getID() {
        return ID;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public Calendar getFavDate() {
        return favDate;
    }

    public ActivityEntity getActivityEntity() {
        return activityEntity;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public void setFavDate(Calendar favDate) {
        this.favDate = favDate;
    }

    public void setActivityEntity(ActivityEntity activityEntity) {
        this.activityEntity = activityEntity;
    }
}
