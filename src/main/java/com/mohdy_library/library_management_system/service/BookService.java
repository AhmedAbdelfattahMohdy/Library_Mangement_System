package com.mohdy_library.library_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohdy_library.library_management_system.model.Book;
import com.mohdy_library.library_management_system.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookByID(Long id) {
        return bookRepository.findById(id).get();
        // .orElseThrow(
        // () -> new ResourceNotFoundException("Book not found")
        // );
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
