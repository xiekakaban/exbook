package com.st.exbook.service;

import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */

public interface UserService {
    void insertUser(UserEntity userEntity);

    List<UserEntity> findAllUsers();

    UserEntity findUserById(String identity);

    UserBaseVO findUserBaseVOById(String identity);
}
