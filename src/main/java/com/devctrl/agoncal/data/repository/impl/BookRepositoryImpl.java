package com.devctrl.agoncal.data.repository.impl;

import com.devctrl.agoncal.data.entity.Book;
import com.devctrl.agoncal.data.entity.FullBook;
import com.devctrl.agoncal.data.metadata.repository.BookRepoInject;
import com.devctrl.agoncal.data.repository.BookRepository;

import java.util.List;

/**
 * Created by rob on 04.01.17.
 */
@BookRepoInject
public class BookRepositoryImpl implements BookRepository{

    public Book saveBook(Book book) {
        return null;
    }

    public FullBook saveFullBook(FullBook fullBook) {
        return null;
    }

    public List<Book> retrieveAllBooks() {
        return null;
    }

    public List<FullBook> retrieveAllFullBooks() {
        return null;
    }

    public Book deleteBook(Book book) {
        return null;
    }

    public FullBook deleteFullBook(FullBook book) {
        return null;
    }
}
