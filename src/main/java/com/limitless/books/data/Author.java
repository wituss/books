package com.limitless.books.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    int id;

    String name;

    String surname;
}
