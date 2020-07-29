package org.taskmanager.service;

import java.util.*;

import org.taskmanager.entity.*;

public interface TaskService {
    CTask addTask(CTask task);
    CTask updateTask(CTask task);
    CTask getTask(long id);
    Collection<CTask> getAllTasks();
    void deleteTask(long id);
}
