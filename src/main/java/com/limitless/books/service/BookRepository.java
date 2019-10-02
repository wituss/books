package com.limitless.books.service;

import com.limitless.books.data.Author;
import com.limitless.books.data.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Iterator<Book> findBooksByAuthor(Author author);
}
