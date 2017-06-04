package com.personal.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by josgar on 02/06/2017.
 */

@RestController
public class GreetingsController {

    @GetMapping(path = "/greetings/{name}")
    Map<String, String> greetings(@PathVariable String name){
        return Collections.singletonMap("Hello !!! ", name);
    }

}
