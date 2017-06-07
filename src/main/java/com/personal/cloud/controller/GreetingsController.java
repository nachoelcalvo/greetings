package com.personal.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

/**
 * Created by josgar on 02/06/2017.
 */

@RestController
public class GreetingsController {

    @GetMapping(path = "/greetings/{name}")
    Map<String, String> greetings(@PathVariable String name,
                                  @RequestHeader("x-forwarded-host") Optional<String> host,
                                  @RequestHeader("x-forwarded-port") Optional<Integer> port) {

        host.ifPresent(System.out::println);
        port.ifPresent(System.out::println);

        return Collections.singletonMap("message", "Helloooo " + name);
    }

}
