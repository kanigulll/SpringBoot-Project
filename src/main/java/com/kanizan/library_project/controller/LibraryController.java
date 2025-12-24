package com.kanizan.library_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kanizan.library_project.service.LibraryService; // DÜZELTİLDİ
import com.kanizan.library_project.entity.*; // DÜZELTİLDİ
import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
    
    @Autowired
    private LibraryService libraryService;

    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author) {
        return libraryService.saveAuthor(author);
    }

    @PostMapping("/book/{authorId}")
    public Book createBook(@PathVariable Long authorId, @RequestBody Book book) {
        return libraryService.createBook(authorId, book);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return libraryService.getAllBooks();
    }
}