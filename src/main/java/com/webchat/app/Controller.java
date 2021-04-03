package com.webchat.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @PostMapping(value = "/new/")
    public String postString(@RequestBody String text) {
        return text;
    }

    @GetMapping(value = "/new/{text}")
    public String getString(@PathVariable String text) {
        return text;
    }

    @GetMapping(value = "/{id}")
    public Integer getInteger(@PathVariable Integer id) {
        return id;
    }
}