package com.bogotaonline.task.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TaskRecord {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name="TITTLE")

    private String tittle;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS")
    private String status;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
