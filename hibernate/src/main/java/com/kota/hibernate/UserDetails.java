package com.kota.hibernate;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity(name="user_details")
public class UserDetails {

    @Id @GeneratedValue
    private int userId;
    private String userName;

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "user_address", joinColumns=@JoinColumn(name="user_Id"))
    @GenericGenerator(strategy = "increment", name = "identity_gen")
    @CollectionId(columns = @Column(name="user_address_id"), generator ="identity_gen", type = @Type(type = "long"))
    private Collection<Address> address = new HashSet<>();


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Collection<Address> getAddress() {
        return address;
    }

    public void setAddress(Collection<Address> address) {
        this.address = address;
    }
}
