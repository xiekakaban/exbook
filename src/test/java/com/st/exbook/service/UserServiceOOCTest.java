package com.st.exbook.service;

import com.google.gson.Gson;
import com.st.exbook.ExbookApplicationTests;
import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import com.st.exbook.mapper.UserMapper;
import com.st.exbook.util.SecurityUtil;
import com.st.exbook.util.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */
public class UserServiceOOCTest extends ExbookApplicationTests {
    @Autowired
    private UserService userService;


    @Test
    public void testInsertUser(){
        UserEntity u = new UserEntity("xiekakaban","123456","ruantianbo@163.com","","", "", "");
        userService.insertUser(u);
    }

    @Test
    public void testFindAllUsers(){
        List<UserEntity> users = userService.findAllUsers();
        System.out.println(StringUtil.GsonSerializeNulls(users));
    }

    @Test
    public void testFindUserById(){
        UserEntity u = userService.findUserById("d895fe3b-bf19-45c6-8064-69e576693bb5");
        System.out.println(StringUtil.GsonSerializeNulls(u));
    }

    @Test
    public void testFindUserBaseVO(){
        UserBaseVO u = userService.findUserBaseVO("d895fe3b-bf19-45c6-8064-69e576693bb5");
        System.out.println(StringUtil.GsonSerializeNulls(u));
    }

}
