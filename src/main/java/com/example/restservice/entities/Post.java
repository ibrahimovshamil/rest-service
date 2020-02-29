package com.example.restservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Post {

    private static final String IMAGEPATH = "img/";

    @Id
    @GeneratedValue
    private int id;
    private LocalDateTime date;
    private String title;
    private String imageSrc;

    public Post(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;
        Post post = (Post) o;
        return getId() == post.getId() &&
                Objects.equals(getDate(), post.getDate()) &&
                Objects.equals(getTitle(), post.getTitle()) &&
                Objects.equals(getImageSrc(), post.getImageSrc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getTitle(), getImageSrc());
    }
}
