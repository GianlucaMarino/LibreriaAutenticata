package it.apulia.LibreriaAutenticata.controller;

import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookService;

import java.util.List;

@RestController

@RequestMapping("/library")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    ResponseEntity<List<Libro>> getAllbook() {
        return ResponseEntity.ok().body(bookService.getAllBooks());
    }
    @GetMapping("")
    ResponseEntity<Libro> getLibro(@Patch String isbn) {
        return ResponseEntity.ok().body(bookService.getAllBooks(isbn));
    }


}
