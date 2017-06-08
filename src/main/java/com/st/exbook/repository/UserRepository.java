package com.st.exbook.repository;

import com.st.exbook.entity.UserEntity;
import com.st.exbook.entity.UserRelationshipMap;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by e604845 on 6/6/2017.
 */
@Repository
public interface UserRepository extends AbstractRepository<UserEntity> {

    UserEntity findByUsername(String username);

    UserEntity findByCreateTimeBetween(Date startDate,Date endDate);


}
