package com.pwc.workbench.api.service;

import com.pwc.workbench.api.dao.UserDao;
import com.pwc.workbench.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer userInsert(User user) {
        return null;
    }

    @Override
    public User queryById(Integer id) {
        return null;
    }
}
