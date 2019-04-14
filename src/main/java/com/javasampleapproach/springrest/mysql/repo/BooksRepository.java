package com.javasampleapproach.springrest.mysql.repo;

import com.javasampleapproach.springrest.mysql.model.Books;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Books , Long> {
    List<Books> findByBookid(Integer id);
    List<Books>findByBookName(String name);
    List<Books> findByAuthor(String name);
    List<Books> findByReview(Integer number);
    List<Books> findAll();

}
