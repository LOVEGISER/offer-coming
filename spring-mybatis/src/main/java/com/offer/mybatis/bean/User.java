package com.offer.mybatis.bean;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    private String id;//
    private String email;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
