package com.st.exbook.service;

import com.google.gson.Gson;
import com.st.exbook.ExbookApplicationTests;
import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import com.st.exbook.entity.UserRelationshipMap;
import com.st.exbook.util.SecurityUtil;
import com.st.exbook.util.StringUtil;
import org.apache.catalina.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */
public class UserServiceOOCTest extends ExbookApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void testInsertUser(){
        for(int i=0;i<10;i++) {
            UserEntity u = new UserEntity("tianyeling"+i, "123456", "", "tianyeling"+i+"@163.com", "", "", "");
            userService.insertUser(u);
        }
    }

    @Test
    @Transactional
    public void testUpdateUser(){
        UserEntity u1 = userService.findUserById("b6a0ff05-f4b8-47c3-b130-38b43f6319aa");
        UserEntity u2 = userService.findUserById("402f6cfe-efb0-421b-ab47-290a1ff1e2af");
        UserEntity u3 = userService.findUserById("cc2f2751-c4d1-4ab2-99fb-41c5bafc85f9");

        u1.addFollowing(u3);
        u1.addFans(u2);

        userService.updateUser(u1);
    }

    @Test
    public void testFindAllUsers(){
        List<UserEntity> users = userService.findAllUsers();
        System.out.println(StringUtil.GsonSerializeNulls(users));
    }

    @Test
    public void testFindUserById(){
        UserEntity u = userService.findUserById("b6a0ff05-f4b8-47c3-b130-38b43f6319aa");
        System.out.println(StringUtil.GsonSerializeNulls(u));
    }

    @Test
    public void testDeleteUserById(){
        UserEntity u = userService.deleteUserById("a9a22ba3-5193-4a42-9b70-772193cfcea7");
        System.out.println(StringUtil.GsonSerializeNulls(u));
    }

    @Test
    public void testFindUserByUsername(){
        UserEntity u = userService.findUserByUsername("xiekakaban");
        System.out.println(StringUtil.GsonSerializeNulls(u));
    }

    @Test
    public void testFindUserByCreateTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,1,1);
        Date startTime = new Date();
        startTime.setTime(calendar.getTimeInMillis());

        Date endTime = new Date();
        calendar.set(2018,1,1);
        endTime.setTime(calendar.getTimeInMillis());
        System.out.println("start time: "+ startTime.getTime()+",now:"+System.currentTimeMillis()+",endTime:"+endTime.getTime());

        UserEntity u = userService.findUserByCreateTime(startTime,endTime);
        System.out.println(StringUtil.GsonSerializeNulls(u));
    }

    @Test
    public void testCheckLogin(){
        final String username = "xiekakaban";
        final String password = "54321";
        UserEntity u = userService.checkLogin(username, password);
        if(u != null){

            System.out.println("验证通过");
        }
        else {
            System.out.println("验证未通过");
        }
    }

}
