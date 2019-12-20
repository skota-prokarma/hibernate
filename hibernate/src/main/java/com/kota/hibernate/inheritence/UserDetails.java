package com.kota.hibernate.inheritence;



import javax.persistence.*;
@Entity(name= "inheritence_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int userId;
    @Column(name="user_name")
    private String userName;



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


}
