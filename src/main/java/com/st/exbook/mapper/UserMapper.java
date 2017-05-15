package com.st.exbook.mapper;

import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.AbstractEntity;
import com.st.exbook.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by e604845 on 5/15/2017.
 */
public interface UserMapper{

    @Insert("insert into tb_users(id,username,password,email,wei_chat,location,ext_param) VALUES (#{id},#{username},#{password},#{email},#{weiChat},#{location},#{extParam})")
    void insertUser(UserEntity userEntity);

    @Select("select * from tb_users")
    List<UserEntity> findAllUsers();

    @Select("select * from tb_users where id=#{identity}")
    UserEntity findUserById(String identity);

    @Select("select id,username,password from tb_users where id=#{identity}")
    UserBaseVO findUserBaseVOById(String identity);


}
