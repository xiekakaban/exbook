package com.st.exbook.service;

import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import com.st.exbook.repository.UserRepository;
import com.st.exbook.util.SecurityUtil;
import com.st.exbook.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity insertUser(UserEntity userEntity) {
        userRepository.save(userEntity);
        UserEntity u = findUserById(userEntity.getId());
        return u;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity findUserById(String identity) {
        return userRepository.findOne(identity);
    }

    @Override
    public UserEntity checkUserLogin(String username, String password) {
        return null;
    }

    @Override
    public UserEntity deleteUserById(String identity) {
        try {
            UserEntity u = userRepository.findOne(identity);
            userRepository.delete(identity);
            return u;
        }catch (Exception ex){
            return null;
        }
    }

    @Override
    public UserEntity findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserEntity findUserByCreateTime(Date startTime, Date endTime) {
        return userRepository.findByCreateTimeBetween(startTime,endTime);
    }

    @Override
    public UserEntity checkLogin(String username,String password) {
        UserEntity u = userRepository.findByUsername(username);
        if(u != null && u.getPassword().equals(SecurityUtil.eccryptMD5(password))){
            return u;
        }
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        userRepository.save(userEntity);
        UserEntity u = findUserById(userEntity.getId());
        return u;
    }


}
