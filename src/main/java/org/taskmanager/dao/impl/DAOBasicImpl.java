package org.taskmanager.dao.impl;

import java.util.*;

import javax.persistence.criteria.*;
import javax.transaction.*;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.taskmanager.dao.*;

@Transactional
public class DAOBasicImpl<T> implements DAOBasic<T> {
    private final Class<T> entityClass;
    protected SessionFactory sessionFactory;

    public DAOBasicImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public T addEntity(T entity) {
        getSession().save(entity);
        return entity;
    }

    @Override
    public T updateEntity(T entity) {
        getSession().update(entity);
        return entity;
    }

    @Override
    public T getEntity(long id) {
        return getSession().get(entityClass, id);
    }

    @Override
    public Collection<T> getAllEntities() {
        CriteriaQuery<T> criteriaQuery = sessionFactory.getCriteriaBuilder().createQuery(entityClass);
        Root<T> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root);

        return getSession().createQuery(criteriaQuery).list();
    }

    @Override
    public void deleteEntity(T entity) {
        getSession().delete(entity);
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
