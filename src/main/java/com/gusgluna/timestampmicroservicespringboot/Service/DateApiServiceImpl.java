package com.gusgluna.timestampmicroservicespringboot.Service;

import com.gusgluna.timestampmicroservicespringboot.Collection.DateApi;
import org.springframework.stereotype.Service;

@Service
public class DateApiServiceImpl implements DateApiService {
    @Override
    public DateApi getActualDate() {
        return new DateApi("Hello", "Mom!!");
    }
}
