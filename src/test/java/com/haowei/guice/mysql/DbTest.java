package com.haowei.guice.mysql;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class DbTest {

    @Test
    public void testDb() throws SQLException {
        Injector injector = Guice.createInjector(new DbModule());
        UserService userService = injector.getInstance(UserService.class);

        User example = new User();
        example.setUsername("haowei6");
        example.setPassword("123");
        userService.save(example);

        String status = userService.authenticate("haowei6", "123");

        Assert.assertEquals(status, "Valid");

    }

}