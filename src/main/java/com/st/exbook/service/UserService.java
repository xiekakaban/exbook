package com.st.exbook.service;

import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */

public interface UserService {
    UserEntity insertUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);

    List<UserEntity> findAllUsers();

    UserEntity findUserById(String identity);

    UserEntity checkUserLogin(String username,String password);

    UserEntity deleteUserById(String identity);

    UserEntity findUserByUsername(String username);

    UserEntity findUserByCreateTime(Date startTime,Date endTime);

    UserEntity checkLogin(String username,String password);
}
