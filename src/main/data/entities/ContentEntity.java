package main.data.entities;


import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;

@Entity(name="content")
public class ContentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;


    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
