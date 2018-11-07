package com.techprimers.sswaggerexample2.swaggerexample2.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Hello Resource EndPoint",description = "shows Hello")
public class HelloResource {

    @ApiOperation(value = "returns Hello")
    @ApiResponses(value = {
            @ApiResponse(code=120,message="100 is the message"),
            @ApiResponse(code=200,message = "Successfull Hello")
    })
    @GetMapping
    public String hello() {
        return "hello";
    }

    @ApiOperation(value = "returns Hello")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "returns Hello")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }

}
