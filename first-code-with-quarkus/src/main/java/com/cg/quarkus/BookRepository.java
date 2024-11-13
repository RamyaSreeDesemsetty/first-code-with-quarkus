package com.cg.quarkus;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import com.cg.quarkus.Book;
@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {

    // Get all books
    public List<Book> getAllBooks() {
        return listAll();
    }

    // Count all books
    public long countAllBooks() {
        return count();
    }

    // Get a specific book by id
    public Book getBook(Long id) {
        return findById(id);
    }
}
