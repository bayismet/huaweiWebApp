package com.example.huawei;

import java.util.ArrayList;

/**
 * User
 */
public class User {
    User() {
    }

    User(String username, String password, ArrayList<TaskList> taskLists) {
        this.username = username;
        this.password = password;
        this.taskLists = taskLists;
    }

    User(String username, String password) {
        this.username = username;
        this.password = password;
        this.taskLists = new ArrayList<TaskList>();
    }

    public User createUser(String username, String password) {
        return new User(username, password);
    }

    public String username;
    public String password;
    public ArrayList<TaskList> taskLists;
}