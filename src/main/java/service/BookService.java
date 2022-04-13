package service;

import model.Book;
import org.springframework.stereotype.Service;
import repository.BookRepository;


import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
