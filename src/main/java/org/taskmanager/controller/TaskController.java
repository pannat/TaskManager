package org.taskmanager.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.taskmanager.entity.*;
import org.taskmanager.service.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskService taskService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public CTask addTask(@RequestBody CTask task) {
        return taskService.addTask(task);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json;charset=utf-8")
    public CTask updateTask(@RequestBody CTask task) {
        return taskService.updateTask(task);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CTask getTaskById(@PathVariable("id") long id) {
        return taskService.getTask(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<CTask> getTask() {
        return taskService.getAllTasks();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTaskById(@PathVariable("id") long id) {
        taskService.deleteTask(id);
    }

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }
}
