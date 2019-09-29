package com.example.VesSpringVes.model;


import com.example.VesSpringVes.entity.UsersEntity;

public class UserModel {

    private int id;
    private String name;
    private String secondName;
    private String lastName;

    public UserModel() {
    }

    public UserModel(int id, String name, String secondName, String lastName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public boolean isNull() {
        return name == null && secondName == null && lastName == null;
    }

    public UsersEntity toUser(){
        return new UsersEntity(name, secondName, lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
