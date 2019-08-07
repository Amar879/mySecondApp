package com.example.secondapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "username")
    private String username;

    @ColumnInfo(name = "age")
    private int age;


    @ColumnInfo(name = "address")
    private String address;


    public User(int uid,String username, String address){
        this.uid=uid;
        this.username=username;
        this.address=address;

    }

    public int getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}