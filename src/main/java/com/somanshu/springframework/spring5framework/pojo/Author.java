package com.somanshu.springframework.spring5framework.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String secondName;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public Author () {
    }

    public Author(final String firstName, String secondName, Set<Book> books) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
