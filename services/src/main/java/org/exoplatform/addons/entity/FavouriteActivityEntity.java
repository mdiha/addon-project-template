package org.exoplatform.addons.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;
import org.exoplatform.social.core.chromattic.entity.ActivityEntity;

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

    @Column(name = "TARGET_ACTIVITY")
    private ActivityEntity activityEntity;

    @Transient
    @Column(name = "FAVORITED_DATE")
    private Calendar favDate;

    public Long getID() {
        return ID;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public ActivityEntity getActivityEntity() {
        return activityEntity;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public void setActivityEntity(ActivityEntity activityEntity) {
        this.activityEntity = activityEntity;
    }

    public void setFavDate(Calendar favDate) {
        this.favDate = favDate;
    }

    public Calendar getFavDate() {
        return favDate;
    }
}
