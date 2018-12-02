package com.techprimers.sswaggerexample2.swaggerexample2.resource;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/tonya")
@Api(value = "endpoint of Tonya")
public class TonyaService {


    @GetMapping

    public String getName(){
        return "Tonya";
    }
}
