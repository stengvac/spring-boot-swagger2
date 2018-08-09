package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ExampleProperty;

@RestController
public class TestController {

    @RequestMapping(value = "/1570", method = RequestMethod.POST)
    @ApiOperation(value = "Demo using examples")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "User not found"),
            @ApiResponse(
                    code = 405,
                    message = "Validation exception",
                    examples = @io.swagger.annotations.Example(
                            value =  {
                                    @ExampleProperty(
                                            mediaType = "Example json",
                                            value = "{\"invalidField\": \"address\"}"),
                                    @ExampleProperty(
                                            mediaType = "Example string",
                                            value = "The first name was invalid")}))})
    public void saveUser() {
        //No-op
    }
}