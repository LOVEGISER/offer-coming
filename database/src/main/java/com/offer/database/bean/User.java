package com.offer.database.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User implements Serializable {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    @Id //表明id是User表的主键
    @GeneratedValue
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
