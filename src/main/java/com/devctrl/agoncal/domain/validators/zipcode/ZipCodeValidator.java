package com.devctrl.agoncal.domain.validators.zipcode;

import com.devctrl.agoncal.domain.validators.country.USA;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rob on 18.12.16.
 */


public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {

    @Inject @USA
    private ZipCodeChecker checker = new ZipCodeChecker();
    private Pattern zipPattern = Pattern.compile("\\d{5}(-\\d{5})?");

    public void initialize(ZipCode zipCode) {

    }

    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null)
            return true;

        Matcher m = zipPattern.matcher(value);
        if (!m.matches())
            return false;
        return checker.isZipCodeValid(value);
    }
}
