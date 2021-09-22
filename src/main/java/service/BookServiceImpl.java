package service;

import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.BookRepo;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    private final BookRepo bookRepository;

    @Autowired
    public BookServiceImpl(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Libro> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Libro getBookByISBN(String isbn) {
        return bookRepository.findById(isbn).get();
    }
}
