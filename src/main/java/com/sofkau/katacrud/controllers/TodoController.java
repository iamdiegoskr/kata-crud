package com.sofkau.katacrud.controllers;

import com.sofkau.katacrud.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private ITodoService service;



}
