package com.example.backendspring.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity //Customers es una entidad
@Table(name = "suppliers")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private String web;
    private String contact;
}

