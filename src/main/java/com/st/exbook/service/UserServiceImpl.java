package com.st.exbook.service;

import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import com.st.exbook.mapper.UserMapper;
import com.st.exbook.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(UserEntity userEntity) {
        userEntity.setPassword(SecurityUtil.eccryptMD5(userEntity.getPassword()));
        userMapper.insertUser(userEntity);
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public UserEntity findUserById(String identity) {
        return userMapper.findUserById(identity);
    }

    @Override
    public UserBaseVO findUserBaseVOById(String identity) {
        return userMapper.findUserBaseVOById(identity);
    }
}
