package com.example.javaproject;


// Folklore.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Folklore {

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy = GenerationType)
    private Long id;

    private String title;
    private String description;
    private String origin;

    // Constructors, getters, setters, and other methods

    // Remember to override equals() and hashCode() methods if needed

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
