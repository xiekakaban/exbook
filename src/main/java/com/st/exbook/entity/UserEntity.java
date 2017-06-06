package com.st.exbook.entity;

import com.st.exbook.repository.UserRepository;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by e604845 on 5/15/2017.
 */
@Entity
@Table(name="tb_users")
public class UserEntity extends AbstractEntity{

    @Column(name="username")
    String username;

    @Column(name="password")
    String password;

    @Column(name="email")
    String email;

    @Column(name="wei_chat")
    String weiChat;

    @Column(name="location")
    String location;

    @Column(name = "ext_param")
    String extParam;

    @Column(name = "sex")
    String sex;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "u2")
    Set<UserRelationshipMap> fans; //粉丝

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "u1")
    Set<UserRelationshipMap> following; //自己关注的人




    public UserEntity() {
        super();
    }

    public UserEntity(String username, String password, String sex, String email, String weiChat, String location, String extParam) {
        super();
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.weiChat = weiChat;
        this.location = location;
        this.extParam = extParam;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeiChat() {
        return weiChat;
    }

    public void setWeiChat(String weiChat) {
        this.weiChat = weiChat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExtParam() {
        return extParam;
    }

    public void setExtParam(String extParam) {
        this.extParam = extParam;
    }

    public Set<UserRelationshipMap> getFans() {
        return fans;
    }

    public void setFans(Set<UserRelationshipMap> fans) {
        this.fans = fans;
    }

    public Set<UserRelationshipMap> getFollowing() {
        return following;
    }

    public void setFollowing(Set<UserRelationshipMap> following) {
        this.following = following;
    }

    public void addFollowing(UserEntity u1){
        UserRelationshipMap ship = new UserRelationshipMap(u1,this);
        if(!(this.getFans().contains(ship))){
            this.getFans().add(ship);
        }
    }

    public void addFans(UserEntity u2){
        UserRelationshipMap ship = new UserRelationshipMap(this,u2);
        if(!(this.getFans().contains(ship))){
            this.getFans().add(ship);
        }
    }
}
