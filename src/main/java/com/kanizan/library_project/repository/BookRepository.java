package com.kanizan.library_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kanizan.library_project.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> { }