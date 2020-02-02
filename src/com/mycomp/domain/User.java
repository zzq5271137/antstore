package com.mycomp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String uid;
    private String username;
    private String password;
    private String phone;

    @Override
    public String toString() {
        return "User [uid=" + uid + ", username=" + username + ", password="
                + password + ", phone=" + phone + "]";
    }
}
