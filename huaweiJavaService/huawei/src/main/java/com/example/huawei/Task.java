package com.example.huawei;

import java.util.Date;

/**
 * Task
 */
public class Task {
    Task() {
    }

    Task(String name, String description, Date deadline, int status) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
    }

    public String name;
    public String description;
    public Date deadline;
    public int status;
    // name, description, deadline, and status

}