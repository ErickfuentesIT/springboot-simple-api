package com.cursojava.curso.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Getter @Setter @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String nombre;
    @Getter @Setter @Column(name = "surname")
    private String apellido;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "phone")
    private String telefono;
    @Getter @Setter @Column(name = "password")
    private String password;

}
