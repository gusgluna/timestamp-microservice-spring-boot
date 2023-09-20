package com.gusgluna.timestampmicroservicespringboot.Service;

import com.gusgluna.timestampmicroservicespringboot.Collection.DateApi;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class DateApiServiceImpl implements DateApiService {
    @Override
    public DateApi getActualDate() {
        Long unixDate = new Date().getTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        String utcString = dateTimeFormatter.format(ZonedDateTime.now(ZoneId.of("UTC")));

        return new DateApi(unixDate, utcString);
    }

    @Override
    public DateApi getStringDateUnix(String strDate) {
        Date stringDate = new Date(Long.parseLong(strDate));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        String utcString = dateTimeFormatter.format(ZonedDateTime.ofInstant(stringDate.toInstant(), ZoneId.of("UTC")));

        return new DateApi(stringDate.getTime(), utcString);
    }

    @Override
    public DateApi getStringDateUtc(String strDate) throws ParseException {
        Date stringDate = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        Date strngDate = new Date(stringDate.getTime()-21600000);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        String utcString = dateTimeFormatter.format(ZonedDateTime.ofInstant(strngDate.toInstant(), ZoneId.of("UTC")));

        return new DateApi(strngDate.getTime(), utcString);
    }
}
