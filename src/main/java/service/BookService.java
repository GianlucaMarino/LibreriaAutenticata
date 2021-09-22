package service;

import model.Libro;

import java.util.List;

public interface BookService {
    List<Libro> getAllBooks();
    Libro getBookByISBN(String isbn);
}
