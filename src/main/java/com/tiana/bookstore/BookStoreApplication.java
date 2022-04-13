package com.tiana.bookstore;

import model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import repository.BookRepository;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder()
				.name("Deniz Feneri")
				.author("Virginia Woolf")
				.price(10.0)
				.stock(10).build();
		Book book2 = Book.builder()
				.name("Middlemarch")
				.author("George Eliot")
				.price(11.1)
				.stock(10).build();
		Book book3 = Book.builder()
				.name("Anna Karenina")
				.author("Leo Tolstoy")
				.price(15.5)
				.stock(10).build();
		bookRepository.saveAll(Arrays.asList(book1, book2, book3));
	}
}
