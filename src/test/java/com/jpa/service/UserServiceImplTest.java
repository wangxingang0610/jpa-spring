package com.jpa.service;


import com.jpa.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class UserServiceImplTest {


    private ApplicationContext ctx = null;

    private UserService userService = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        userService = ctx.getBean(UserService.class);
    }

    @Test
    public void testSave(){

        User user = new User();
        user.setAge(20);
        user.setEmail("aaa@126.com");
        user.setUserName("aa");

        userService.save(user);
    }


    @Test
    public void testDataSourct() throws Exception {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
