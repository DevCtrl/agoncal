package com.devctrl.agoncal.domain.service;

import com.devctrl.agoncal.data.entity.Book;
import com.devctrl.agoncal.domain.service.impl.BookServiceImpl;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by rob on 15.12.16.
 */
public class BookServiceIT {

    @Test
    public void shouldCheckNumberIsMock() {

        Weld weld = new Weld();
        // with 2.2 weld treats the two beans.xml files a two separate archives. To have test alternative override that
        // we need to switch off this feature
        System.setProperty(Weld.ARCHIVE_ISOLATION_SYSTEM_PROPERTY, "false");
        WeldContainer container = weld.initialize();

        BookServiceImpl bookService = container.instance().select(BookServiceImpl.class).get();

        Book book = bookService.saveBook("H2G2", 12.5f, "Geeky scifi Book");

        assertTrue(book.getNumber().startsWith("MOCK"));

        weld.shutdown();
    }

}
