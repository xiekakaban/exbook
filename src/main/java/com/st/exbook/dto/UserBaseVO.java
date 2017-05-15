package com.st.exbook.dto;

/**
 * Created by e604845 on 5/15/2017.
 */
public class UserBaseVO {
    String id;
    String username;
    String password;

    public UserBaseVO() {
    }

    public UserBaseVO(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
