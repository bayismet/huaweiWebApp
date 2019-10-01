package com.example.huawei;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {
    Date today = Calendar.getInstance().getTime();
    ArrayList<User> userList = new ArrayList<User>();
    ArrayList<Task> tasks = new ArrayList<Task>();
    ArrayList<Task> tasksTwo = new ArrayList<Task>();
    TaskList taskList = new TaskList(new ArrayList<Task>(), "");
    TaskList taskListTwo = new TaskList(new ArrayList<Task>(), "");

    UserService() {
        taskList.name = "First task list";
        taskList.taskList.add(new Task("Do errands", "Lawn your front yard, take our trash", today, 0));
        taskList.taskList.add(new Task("Wash dishes", "Few pieces left", today, 1));
        taskList.taskList.add(new Task("Pay the bills", "Total amount is $23", today, 0));
        taskList.taskList.add(new Task("2", "22", today, 0));

        taskListTwo.taskList.add(new Task("Second Do errands", "Lawn fawfawfaw", today, 1));
        taskListTwo.taskList.add(new Task("Take the dog to walk", "Take Einstein to walk", today, 1));
        taskList.taskList.add(new Task("Watch a Movie", "Watch any director but Gaspar Noé", today, 0));
        taskList.taskList.add(new Task("Lorem Ipsum", "Learn Latin", today, 0));
        taskList.taskList.add(new Task("Work out", "Do some running", today, 0));
        taskList.taskList.add(new Task("3", "333", today, 1));
        taskListTwo.name = "Second task list";

        userList.add(new User("lec16", "iloveferrari"));
        userList.add(new User("seb5", "spinaround", new ArrayList<TaskList>()));
        userList.add(new User("ismet", "123456"));
        userList.get(2).taskLists.add(taskList);
        userList.get(2).taskLists.add(taskListTwo);
    }

    ArrayList<User> getAllUsers() {
        return userList;
    }

    User getUser(int id) {
        return userList.get(id);
    }
}