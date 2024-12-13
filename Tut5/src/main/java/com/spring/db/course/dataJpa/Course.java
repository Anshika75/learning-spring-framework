package com.spring.db.course.dataJpa;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// @Entity(name = "Course")
@Entity
public class Course {
    @Id
    @GeneratedValue
    private long id;

    // @Column(name = "name")
    private String name;

    // @Column(name = "author")
    private String author;

    @Override
    public String toString() {
        return "Course[" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + ']';
    }

    public Course() {
    }

    // constructor
    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    // setters


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
