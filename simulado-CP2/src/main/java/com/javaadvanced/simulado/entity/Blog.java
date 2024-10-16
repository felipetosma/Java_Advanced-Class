package com.javaadvanced.simulado.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "content")
    private String content;

}

