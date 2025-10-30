package com.cursojava.curso.controller;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario edit(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario delete(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario delete(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

}
