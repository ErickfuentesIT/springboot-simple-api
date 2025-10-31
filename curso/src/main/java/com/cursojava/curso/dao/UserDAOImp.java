package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDAOImp implements IUserDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsers() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void createUser(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean validateCredentials(Usuario usuario) {
        String query = "FROM Usuario WHERE email= :email";
       List<Usuario> listUser = entityManager.createQuery(query).setParameter("email", usuario.getEmail()).getResultList();

       if(listUser.isEmpty()){
           return false;
       }

        String passwordHashed = listUser.get(0).getPassword();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.verify(passwordHashed, usuario.getPassword());
    }

    @Override
    public void deleteUser(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }


}
