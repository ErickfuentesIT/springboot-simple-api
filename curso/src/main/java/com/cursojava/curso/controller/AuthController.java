package com.cursojava.curso.controller;

import com.cursojava.curso.dao.IUserDAO;
import com.cursojava.curso.models.Usuario;
import com.cursojava.curso.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private IUserDAO userDAO;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/v1/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){
        Usuario logUser = userDAO.validateAndGetIdUser(usuario);
        if(logUser != null) {
            String tokenJWT = jwtUtil.create(String.valueOf(logUser.getId()), logUser.getEmail());
            return tokenJWT;
        }
        return "FAIL";
    }
}
