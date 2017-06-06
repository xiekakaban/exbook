package com.st.exbook.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by e604845 on 6/6/2017.
 */
@Entity
@Table(name="tb_user_relationship")
public class UserRelationshipMap extends AbstractMapEntity{

    @ManyToOne
    @JoinColumn(name="u1",referencedColumnName = "id",nullable = false)
    private UserEntity u1;

    @ManyToOne
    @JoinColumn(name="u2",referencedColumnName = "id",nullable = false)
    private UserEntity u2;

    @Column(name="create_time")
    private Date createTime;

    public UserRelationshipMap(UserEntity u1, UserEntity u2) {
        this.u1 = u1;
        this.u2 = u2;
        this.createTime = new Date();
    }

    public UserRelationshipMap() {
    }

    public UserEntity getU1() {
        return u1;
    }

    public void setU1(UserEntity u1) {
        this.u1 = u1;
    }

    public UserEntity getU2() {
        return u2;
    }

    public void setU2(UserEntity u2) {
        this.u2 = u2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
