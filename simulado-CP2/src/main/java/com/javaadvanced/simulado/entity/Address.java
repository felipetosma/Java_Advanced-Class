package com.javaadvanced.simulado.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rua;
    private String cep;
    private String cidade;

    @OneToOne(mappedBy = "address")
    private Owner owner;
}
