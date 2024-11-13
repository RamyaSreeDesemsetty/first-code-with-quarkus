package com.cg.quarkus;

import com.cg.quarkus.Book;
import com.cg.quarkus.BookRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON) // Correct use here at the class level
@Consumes(MediaType.APPLICATION_JSON) // Correct use here at the class level
public class BookResource {

    @Inject
    BookRepository bookRepository;

    // Endpoint to get all books
    @GET
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    // Endpoint to count all books
    @GET
    @Path("/count")
    public long countAllBooks() {
        return bookRepository.countAllBooks();
    }

    // Endpoint to get a book by id
    @GET
    @Path("/{id}")
    public Book getBook(@PathParam("id") Long id) {
        return bookRepository.getBook(id);
    }
}
