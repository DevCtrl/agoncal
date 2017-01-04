package com.devctrl.agoncal.domain.service.impl;

import com.devctrl.agoncal.data.entity.Book;
import com.devctrl.agoncal.data.entity.FullBook;
import com.devctrl.agoncal.data.generator.NumberGenerator;
import com.devctrl.agoncal.data.metadata.digits.ThirteenDigits;
import com.devctrl.agoncal.data.metadata.repository.BookRepoInject;
import com.devctrl.agoncal.data.repository.BookRepository;
import com.devctrl.agoncal.domain.service.BookService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by rob on 15.12.16.
 */
public class BookServiceImpl implements BookService {

    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;

    @Inject @BookRepoInject
    private BookRepository bookRepository;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }

    public Book saveBook(Book book){
        return bookRepository.saveBook(book);
    }

    public FullBook saveFullBook(FullBook book){
        return bookRepository.saveFullBook(book);
    }

    public List<Book> retrieveBooks(){
        return bookRepository.retrieveAllBooks();
    }

    public List<FullBook> retrieveFullBooks(){
        return bookRepository.retrieveAllFullBooks();
    }

    public Book deleteBook(Book book){
        return bookRepository.deleteBook(book);
    }

    public FullBook deleteFullBook(FullBook book){
        return bookRepository.deleteFullBook(book);
    }
}
