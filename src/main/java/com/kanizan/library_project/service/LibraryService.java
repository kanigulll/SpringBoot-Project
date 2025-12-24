package com.kanizan.library_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kanizan.library_project.repository.*;
import com.kanizan.library_project.entity.*;
import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Long authorId, Book book) {
        Author author = authorRepository.findById(authorId).orElse(null);
        if(author != null){
            book.setAuthor(author);
            return bookRepository.save(book);
        }
        return null;
    }
}