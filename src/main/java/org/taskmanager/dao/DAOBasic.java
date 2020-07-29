package org.taskmanager.dao;

import java.util.*;

public interface DAOBasic<T> {
    T addEntity(T entity);
    T updateEntity(T entity);
    T getEntity(long id);
    Collection<T> getAllEntities();
    void deleteEntity(T entity);
}
