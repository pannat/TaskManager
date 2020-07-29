package org.taskmanager.dao.impl;

import org.taskmanager.dao.*;
import org.taskmanager.entity.*;

public class DAOTaskImpl extends DAOBasicImpl<CTask> implements DAOTask {
    public DAOTaskImpl(Class<CTask> entityClass) {
        super(entityClass);
    }
}
