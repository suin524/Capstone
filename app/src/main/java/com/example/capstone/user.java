package com.example.capstone;

public class user {
    String email;
    String name;
    String phone;

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public user(String email, String name, String phone){
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
}
