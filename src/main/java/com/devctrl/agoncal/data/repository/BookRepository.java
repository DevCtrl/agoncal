package com.devctrl.agoncal.data.repository;

import com.devctrl.agoncal.data.entity.Book;
import com.devctrl.agoncal.data.entity.FullBook;

import java.util.List;

/**
 * Created by rob on 04.01.17.
 */
public interface BookRepository extends Repository{

    Book saveBook(Book book);
    FullBook saveFullBook(FullBook fullBook);

    List<Book> retrieveAllBooks();
    List<FullBook> retrieveAllFullBooks();

    Book deleteBook(Book book);
    FullBook deleteFullBook(FullBook book);

}
