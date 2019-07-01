package com.pwc.workbench.api.service;

import com.pwc.workbench.api.entity.User;

public interface IUserService {

    Integer userInsert(User user);

    User queryById(Integer id);
}
