package com.kota.hibernate.OneToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String state;
    private String pincode;
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private UserDetails userDetail ;

    public UserDetails getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetails userDetail) {
        this.userDetail = userDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
