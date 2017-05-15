package com.st.exbook.entity;

/**
 * Created by e604845 on 5/15/2017.
 */
public class UserEntity extends AbstractEntity{

    String username;
    String password;
    String email;
    String weiChat;
    String location;
    String extParam;
    String sex;
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
}
