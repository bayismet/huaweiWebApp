package com.example.huawei;

import java.util.ArrayList;

/**
 * TaskList
 */
public class TaskList {
    TaskList() {

    }

    TaskList(String name) {
        this.name = name;
        this.taskList = new ArrayList<Task>();
    }

    TaskList(ArrayList<Task> taskList, String name) {
        this.taskList = taskList;
        this.name = name;
    }

    public ArrayList<Task> taskList;
    public String name;
}