package com.limitless.books.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Book {

    @ManyToOne
    Author author;

    @Id
    int id;

    String title;

}
