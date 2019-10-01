package com.example.huawei;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TaskController
 */

@RestController
@CrossOrigin(origins = "null")
public class TaskController {
    @Autowired
    public UserService userService;

    @PostMapping("/taskList/add")
    public ResponseEntity<String> addTaskList(String username, String name) {
        for (int i = 0; i < userService.userList.size(); i++) {
            if (userService.userList.get(i).username.equals(username)) {
                userService.userList.get(i).taskLists.add(new TaskList(name));
                return ResponseEntity.status(200).body("Task list added successfully!");
            }
        }

        return ResponseEntity.status(418).body("An error occured!");
    }

    @PostMapping("/task/add")
    public ResponseEntity<String> addTask(String username, String name, String description, String date, int id) {
        for (int i = 0; i < userService.userList.size(); i++) {
            if (userService.userList.get(i).username.equals(username)) {
                userService.userList.get(i).taskLists.get(id).taskList
                        .add(new Task(
                                name, description, new Date(Integer.parseInt(date.substring(0, 3)),
                                        Integer.parseInt(date.substring(5, 6)), Integer.parseInt(date.substring(8, 9))),
                                0));
                return ResponseEntity.status(200).body("Task added successfully!");
            }
        }

        return ResponseEntity.status(418).body("An error occured!");
    }

    @PostMapping("/taskList/delete")
    public ResponseEntity<String> deleteTaskList(String username, int id) {
        for (int i = 0; i < userService.userList.size(); i++) {
            if (userService.userList.get(i).username.equals(username)) {
                userService.userList.get(i).taskLists.remove(id);
                return ResponseEntity.status(200).body("Task list deleted successfully!");
            }
        }

        return ResponseEntity.status(418).body("An error occured!");
    }

    @PostMapping("/task/delete")
    public ResponseEntity<String> deleteTask(String username, String name, int id) {
        for (int i = 0; i < userService.userList.size(); i++) {
            if (userService.userList.get(i).username.equals(username)) {
                for (int j = 0; j < userService.userList.get(i).taskLists.get(id).taskList.size(); j++) {
                    if (userService.userList.get(i).taskLists.get(id).taskList.get(j).name.equals(name)) {
                        userService.userList.get(i).taskLists.get(id).taskList.remove(j);
                    }
                }
                ;
                return ResponseEntity.status(200).body("Task list deleted successfully!");
            }
        }

        return ResponseEntity.status(418).body("An error occured!");
    }
}
