package com.example.Mapping.UserEntity;

import jakarta.persistence.*;

@Entity
public class UserInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userInfoId;
    private long mobile;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;

    public UserInfo(long mobile, Gender gender, String nationality) {
        this.mobile = mobile;
        this.gender = gender;
        this.nationality = nationality;
    }

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoId=" + userInfoId +
                ", mobile=" + mobile +
                ", gender=" + gender +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
