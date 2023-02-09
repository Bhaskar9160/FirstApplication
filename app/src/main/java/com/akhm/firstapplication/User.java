package com.akhm.firstapplication;

public class User {
    private String name;
    private String password;

    private String emailId;
    private String mobileNumber;
    private String cityCode;
    private String userType;

    public User(String name, String password,String emailId,String mobileNumber,String cityCode,String userType) {
        this.name = name;
        this.password = password;
        this.emailId = emailId;
        this.mobileNumber= mobileNumber;
        this.cityCode= cityCode;
        this.userType= userType;
    }

    public User( String password,String emailId) {

        this.password = password;
        this.emailId = emailId;

    }
}
