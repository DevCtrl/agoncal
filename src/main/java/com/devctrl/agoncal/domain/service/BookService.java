package com.devctrl.agoncal.domain.service;

import com.devctrl.agoncal.data.entity.Book;
import com.devctrl.agoncal.data.generator.NumberGenerator;
import com.devctrl.agoncal.data.metadata.digits.ThirteenDigits;

import javax.inject.Inject;

/**
 * Created by rob on 15.12.16.
 */
public class BookService {

    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }

}
