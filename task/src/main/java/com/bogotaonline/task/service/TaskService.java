package com.bogotaonline.task.service;

import com.bogotaonline.task.models.TaskRecord;
import com.bogotaonline.task.repository.TaskRepository;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

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
        taskRecord.setDate(record.getDate());
        return this.taskRepository.save(taskRecord);
    }

    public void deleteById(long id){
        TaskRecord record = this.taskRepository.findById(id).get();
        this.taskRepository.delete(record);
    }

    public List<TaskRecord> getByStatus(String status){
        return this.taskRepository.findByStatus(status);

    }

    public List<TaskRecord> getAll(){
        return this.taskRepository.findAll();
    }

    public List<TaskRecord> findByDate(){
        return this.taskRepository.findByDateAfterOrderByDate(LocalDate.now());
    }

}
