package com.bogotaonline.task.controller;

import com.bogotaonline.task.models.TaskRecord;
import com.bogotaonline.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(path = "task")
public class TaskController {

    private TaskService TaskService;

    public TaskController(TaskService TaskService) {
        this.TaskService = TaskService;

    }

    @PostMapping("/create")
    @ResponseStatus(CREATED)
    public TaskRecord create(@RequestBody TaskRecord record) {
        return this.TaskService.create(record);

    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public TaskRecord getById(@PathVariable Long id) {
        return this.TaskService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(CREATED)
    public TaskRecord updateById(@PathVariable long id, @RequestBody TaskRecord record) {
        return this.TaskService.updateById(id, record);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(OK)
    public void deleteById(@PathVariable long id) {
        this.TaskService.deleteById(id);
    }

   @GetMapping("/status")
   @ResponseStatus(OK)
    public List<TaskRecord> getByStatus(@RequestParam String status){
        return this.TaskService.getByStatus(status);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<TaskRecord> getAll(){
        return this.TaskService.getAll();
    }

}






