package org.taskmanager.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.taskmanager.dao.*;
import org.taskmanager.entity.*;
import org.taskmanager.service.*;

@Service("taskService")
public class TaskServiceImpl implements TaskService {
    private DAOTask daoTask;

    @Override
    public CTask addTask(CTask task) {
        return daoTask.addEntity(task);
    }

    @Override
    public CTask updateTask(CTask task) {
        return daoTask.updateEntity(task);
    }

    @Override
    public CTask getTask(long id) {
        return daoTask.getEntity(id);
    }

    @Override
    public Collection<CTask> getAllTasks() {
        return daoTask.getAllEntities();
    }

    @Override
    public void deleteTask(long id) {
        daoTask.deleteEntity(getTask(id));
    }

    @Autowired
    public void setTask(DAOTask daoTask) {
        this.daoTask = daoTask;
    }
}
