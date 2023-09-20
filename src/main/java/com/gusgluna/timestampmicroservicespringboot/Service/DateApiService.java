package com.gusgluna.timestampmicroservicespringboot.Service;

import com.gusgluna.timestampmicroservicespringboot.Collection.DateApi;

import java.text.ParseException;

public interface DateApiService {
    DateApi getActualDate();

    DateApi getStringDateUnix(String strDate);

    DateApi getStringDateUtc(String strDate) throws ParseException;
}
