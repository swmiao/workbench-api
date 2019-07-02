package com.pwc.workbench.api.dao;

import com.pwc.workbench.api.ApiApplication;
import com.pwc.workbench.api.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void userInsert() {
        System.out.println(userDao);
    }

    @Test
    public void queryById() {
    }

    @Test
    public void list() {
        List<User> list = userDao.list();
        list.forEach(System.out::println);
    }
}