package com.example.springoracle.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
@Id
     public int id;
    public String bookname;
    public String status;
    public int month;

}
