package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface IUserDAO {

    void deleteUser(Long id);

    List<Usuario> getUsers();

    void createUser(Usuario usuario);

    boolean validateCredentials(Usuario usuario);
}
