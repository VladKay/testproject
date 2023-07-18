package main.data.entities;


import javax.persistence.Id;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity(name="content")
public class ContentEntity {
    @Id
    private Serializable id;
    private String describtion;

    public ContentEntity(){
        this.id=1;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Serializable getId() {
        return id;
    }

    public String getDescribtion() {
        return describtion;
    }
}
