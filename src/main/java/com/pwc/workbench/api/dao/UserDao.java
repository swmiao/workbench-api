package com.pwc.workbench.api.dao;

import com.pwc.workbench.api.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    Integer userInsert(@Param("user") User user);

    User queryById(@Param("id") Integer id);

    @Select("select * from tianjun_test")
    List<User> list();
}
