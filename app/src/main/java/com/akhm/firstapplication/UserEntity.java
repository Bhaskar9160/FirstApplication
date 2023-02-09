package com.akhm.firstapplication;

public class UserEntity {
    private Integer userId;
    private String name;
    private String password;

    private String emailId;
    private String mobileNumber;
    private String countryCode;
    private String userType;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    @Override
    public String toString() {
        return "UserEntity [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", password=" + password
                + ", mobileNumber=" + mobileNumber + ", countryCode=" + countryCode + ", userType=" + userType + "]";
    }


}

