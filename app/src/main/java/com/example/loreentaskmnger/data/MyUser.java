package com.example.loreentaskmnger.data;

public class MyUser
{
    private String fname;
    private String lname;
    private String key;
    private String email;
    private String phone;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getKey() {
        return key;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", key='" + key + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

