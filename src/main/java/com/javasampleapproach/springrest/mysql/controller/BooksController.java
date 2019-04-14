package com.javasampleapproach.springrest.mysql.controller;

import com.javasampleapproach.springrest.mysql.model.Books;
import com.javasampleapproach.springrest.mysql.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost :4200")
@RestController
@RequestMapping("/api")

public class BooksController {
    @Autowired
    BooksRepository repository;
@GetMapping("/books")
    public List<Books> getAllBooks(){
        System.out.println("Get all Books...");

        List<Books> books = new ArrayList<>();
        repository.findAll().forEach(books:: add);

        return books;
    }


}
