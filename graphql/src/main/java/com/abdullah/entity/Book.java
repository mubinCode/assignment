package com.abdullah.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Book {
    @Id
    private long bookId;
    private String title;
    private String author;
    private String description;
    private double price;
    private int page;
}
