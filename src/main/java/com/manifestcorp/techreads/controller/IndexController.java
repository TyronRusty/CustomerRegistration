package com.manifestcorp.techreads.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class IndexController {
    @GetMapping("/")
    public RedirectView index() {
        return new RedirectView("books");
    }
    }


