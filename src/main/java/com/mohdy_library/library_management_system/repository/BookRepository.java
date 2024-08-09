package com.mohdy_library.library_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohdy_library.library_management_system.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
