package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookid;

    @Column
    private String bookName;

    @Column
    private String author;

    @Column
    private Integer review;

    public Books() {
    }

    public Books(Long bookid, String bookName, String author, Integer review) {
        this.bookid = bookid;
        this.bookName = bookName;
        this.author = author;
        this.review = review;
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", review=" + review +
                '}';
    }
}
