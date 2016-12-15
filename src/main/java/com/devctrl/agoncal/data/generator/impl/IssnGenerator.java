package com.devctrl.agoncal.data.generator.impl;

import com.devctrl.agoncal.data.generator.NumberGenerator;
import com.devctrl.agoncal.data.metadata.Loggable;
import com.devctrl.agoncal.data.metadata.digits.EightDigits;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by rob on 15.12.16.
 */

@EightDigits
public class IssnGenerator implements NumberGenerator {

    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String issn =  "8-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN : " + issn);
        return issn;

    }
}
