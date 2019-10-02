package com.limitless.books.service;

import com.limitless.books.data.Author;
import com.limitless.books.data.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BooksController {

    private final BookRepository books;
    private final AuthorRepository authors;

    @GetMapping("books/{bookId}")
    public Optional<Book> getBookDetails(@PathVariable int bookId) {
        return books.findById(bookId);
    }

    @GetMapping("books")
    public Iterable<Book> getAllBooks() {
        return books.findAll();
    }

    @GetMapping("/author/{authodId}/books")
    public Optional<Author> getAuthorBooks(@PathVariable int authodId) {
        books.findBooksByAuthor(authors.findById(authodId).orElseThrow(() -> new RuntimeException("User not found")));
        return authors.findById(authodId);
    }

    @GetMapping("/author/{authorId}")
    public Optional<Author> getAuthorDetails(@PathVariable int authorId) {
        return authors.findById(authorId);
    }
}
