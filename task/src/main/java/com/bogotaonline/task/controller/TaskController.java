package com.bogotaonline.task.controller;

import com.bogotaonline.task.models.TaskRecord;
import com.bogotaonline.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "task")
public class TaskController {

    private TaskService TaskService;
    public TaskController(TaskService TaskService){
        this.TaskService = TaskService;

    }

    @PostMapping("/create")
    public TaskRecord create(@RequestBody TaskRecord record){
        return this.TaskService.create(record);

    }

    @GetMapping("/get/{id}")
    public TaskRecord getById(@PathVariable Long id){
        return this.TaskService.getById(id);
    }




}
