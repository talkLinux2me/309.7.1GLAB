package com.example._971.model;

import jakarta.persistence.*;
import lombok.Setter;

//import javax.persistence.*;
@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    @Column(name = "title")
    private String title;

    @Setter
    @Column(name = "description")
    private String description;

    @Setter
    @Column(name = "published")
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(String title, String description, boolean published)   {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublished() {
        return published;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
