package com.devctrl.agoncal.domain.service;

import com.devctrl.agoncal.data.entity.Book;

/**
 * Created by rob on 23.12.16.
 */
public interface BookService {
    Book createBook(String title, Float price, String description);
}
