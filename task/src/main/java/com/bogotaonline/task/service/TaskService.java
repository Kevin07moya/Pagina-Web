package com.bogotaonline.task.service;

import com.bogotaonline.task.models.TaskRecord;
import com.bogotaonline.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService (TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public TaskRecord create(TaskRecord record){
       return this.taskRepository.save(record);
    }

    public TaskRecord getById(long id) {
        Optional<TaskRecord> record = this.taskRepository.findById(id);
        return record.orElse(null);

    }

    public TaskRecord updateById(long Id, TaskRecord record){
        TaskRecord taskRecord = this.taskRepository.findById(Id).get();
        taskRecord.setTittle(record.getTittle());
        taskRecord.setDescription(record.getDescription());
        taskRecord.setStatus(record.getStatus());
        return this.taskRepository.save(record);
    }

}
