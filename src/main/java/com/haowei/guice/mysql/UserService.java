package com.haowei.guice.mysql;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;

public class UserService {
    @Inject
    private EntityManager entityManager;

    @Transactional
    public String authenticate(String username, String password) {
        String status = null;
        String query = "from User where username=:username and password=:password";
        User user = (User) entityManager.createQuery(query).setParameter("username", username).setParameter("password", password).getSingleResult();
        if(user != null){
            status = "Valid";
        }
        else{
            status = "Invalid";
        }
        return status;
    }

    @Transactional
    public void save(User user){
        entityManager.persist(user);
    }
}
