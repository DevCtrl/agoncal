package com.devctrl.agoncal.domain.service;

import com.devctrl.agoncal.data.entity.Book;
import com.devctrl.agoncal.data.entity.FullBook;

import java.util.List;

/**
 * Created by rob on 23.12.16.
 */
public interface BookService {

    Book saveBook(String title, Float price, String description);
    Book saveBook(Book book);
    FullBook saveFullBook(FullBook book);

    Book updateBook(Book book);
    FullBook updateFullBook(FullBook book);

    Book getBookById(long id);
    FullBook getFullBookById(long id);

    List<Book> retrieveBooks();
    List<FullBook> retrieveFullBooks();

    Book deleteBook(Book book);
    FullBook deleteFullBook(FullBook book);
}
