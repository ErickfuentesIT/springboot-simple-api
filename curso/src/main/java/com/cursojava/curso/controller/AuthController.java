package com.cursojava.curso.controller;

import com.cursojava.curso.dao.IUserDAO;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private IUserDAO userDAO;


    @RequestMapping(value = "api/v1/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){
        if(userDAO.validateCredentials(usuario)) {
            return "OK";
        }
        return "FAIL";
    }
}
