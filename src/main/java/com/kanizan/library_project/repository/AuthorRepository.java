package com.kanizan.library_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kanizan.library_project.entity.Author; 

public interface AuthorRepository extends JpaRepository<Author, Long> { 
}