package com.gusgluna.timestampmicroservicespringboot.Controller;

import com.gusgluna.timestampmicroservicespringboot.Collection.DateApi;
import com.gusgluna.timestampmicroservicespringboot.Service.DateApiService;
import com.gusgluna.timestampmicroservicespringboot.Validation.DateStringValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/")
@Validated
public class ApiController {

    @Autowired
    private DateApiService dateApiService;
    @GetMapping
    public DateApi api(){
        return dateApiService.getActualDate();
    }

    @GetMapping("{strDate}")
    public ResponseEntity stringDate(@PathVariable String strDate) throws ParseException {
        DateStringValidator stringValidator = new DateStringValidator();
        Map<String, String> errorMsg = new HashMap<>();
        errorMsg.put("error", "Invalid Date");
        if (stringValidator.isUnixDate(strDate)){
            return new ResponseEntity<>(dateApiService.getStringDateUnix(strDate), HttpStatus.OK);
        } else if (stringValidator.isUtcDate(strDate)) {
             return new ResponseEntity<>(dateApiService.getStringDateUtc(strDate), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(errorMsg, HttpStatus.BAD_REQUEST);
        }
    }
}
