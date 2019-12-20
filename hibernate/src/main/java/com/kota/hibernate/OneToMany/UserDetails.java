package com.kota.hibernate.OneToMany;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
public class UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int userId;
    @Column(name="user_name")
    private String userName;

    @OneToOne( mappedBy = "userDetail", cascade = CascadeType.ALL)
    private Address addresses ;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }
}
