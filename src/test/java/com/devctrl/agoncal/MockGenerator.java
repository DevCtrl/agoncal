package com.devctrl.agoncal;

import com.devctrl.agoncal.data.generator.NumberGenerator;
import com.devctrl.agoncal.data.metadata.Loggable;
import com.devctrl.agoncal.data.metadata.digits.ThirteenDigits;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by rob on 15.12.16.
 */

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("Generated Mock : " + mock);
        return mock;
    }

}
