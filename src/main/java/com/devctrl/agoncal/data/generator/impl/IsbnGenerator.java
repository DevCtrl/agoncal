package com.devctrl.agoncal.data.generator.impl;

import com.devctrl.agoncal.data.generator.NumberGenerator;
import com.devctrl.agoncal.data.metadata.Loggable;
import com.devctrl.agoncal.data.metadata.digits.ThirteenDigits;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by rob on 15.12.16.
 */

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN : " + isbn);
        return isbn;
    }
}
