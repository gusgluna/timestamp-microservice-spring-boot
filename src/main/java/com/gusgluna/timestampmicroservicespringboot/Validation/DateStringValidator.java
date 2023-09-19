package com.gusgluna.timestampmicroservicespringboot.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateStringValidator {
    public boolean isValid(String dateString){
        Pattern unix = Pattern.compile("^[0-9]*$");
        Matcher unixMatcher = unix.matcher(dateString);
        return  unixMatcher.matches();
    }
}
