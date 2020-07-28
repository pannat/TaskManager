package org.taskmanager.config;

import javax.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.*;
import org.springframework.jdbc.datasource.*;
import org.taskmanager.dao.*;
import org.taskmanager.dao.impl.*;
import org.taskmanager.entity.*;

@Configuration
@PropertySource(value = "classpath:connect.properties")
public class DataConfig {
    Environment environment;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.postgresql.driver"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.postgresql.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.postgresql.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.postgresql.password"));
        return dataSource;
    }

    @Bean
    public DAOTask daoTask() {
        return new DAOTaskImpl(CTask.class);
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
