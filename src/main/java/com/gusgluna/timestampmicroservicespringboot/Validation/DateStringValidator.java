package com.gusgluna.timestampmicroservicespringboot.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateStringValidator {
    public boolean isUnixDate(String dateString){
        Pattern unix = Pattern.compile("^[0-9]*$");
        Matcher unixMatcher = unix.matcher(dateString);
        return  unixMatcher.matches();
    }

    public boolean isUtcDate(String dateString){
        Pattern utc = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
        Matcher utcMatcher = utc.matcher(dateString);
        return  utcMatcher.matches();
    }

}
