package org.taskmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class CTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String color;

    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
