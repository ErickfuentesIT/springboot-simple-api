package com.cursojava.curso.controller;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUser(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuarioasd")
    public Usuario edit(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuarioafqw")
    public Usuario delete(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuariodsaqwer")
    public Usuario searchUser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Fuentes");
        usuario.setEmail("erickfuentes.it@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

}
