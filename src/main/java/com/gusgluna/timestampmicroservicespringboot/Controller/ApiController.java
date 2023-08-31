package com.gusgluna.timestampmicroservicespringboot.Controller;

import com.gusgluna.timestampmicroservicespringboot.Collection.DateApi;
import com.gusgluna.timestampmicroservicespringboot.Service.DateApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApiController {

    @Autowired
    private DateApiService dateApiService;
    @GetMapping
    public DateApi api(){
        return dateApiService.getActualDate();
    }

    @GetMapping("{strDate}")
    public DateApi stringDate(@PathVariable String strDate){
        return dateApiService.getStringDate(strDate);
    }
}
