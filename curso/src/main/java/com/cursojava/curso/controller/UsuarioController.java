package com.cursojava.curso.controller;

import com.cursojava.curso.dao.IUserDAO;
import com.cursojava.curso.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUserDAO userDAO;

    @RequestMapping(value = "api/v1/usuarios")
    public List<Usuario> getUsers(){
    return userDAO.getUsers();
    }

    @RequestMapping(value = "api/v1/usuarios/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userDAO.deleteUser(id);
    }

    @RequestMapping(value = "api/v1/usuarios", method = RequestMethod.POST)
    public void createUser(@RequestBody Usuario usuario){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword());
        usuario.setPassword(hash);
        userDAO.createUser(usuario);
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
