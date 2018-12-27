package com.jpa.dao;

import com.jpa.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;


public interface UserDao {

    public void save(User user);
}
