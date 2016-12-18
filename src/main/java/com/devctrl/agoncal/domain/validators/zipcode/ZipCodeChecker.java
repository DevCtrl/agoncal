package com.devctrl.agoncal.domain.validators.zipcode;

import com.devctrl.agoncal.domain.validators.country.USA;

/**
 * Created by rob on 18.12.16.
 */

@USA
public class ZipCodeChecker {

    public boolean isZipCodeValid(String zipCode){
        // Call an external web service to check zipcode
        return true;
    }

}
