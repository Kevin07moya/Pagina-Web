package com.bogotaonline.task.repository;

import com.bogotaonline.task.models.TaskRecord;
import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskRecord, Long> {

    public List<TaskRecord> findByStatus(String status);

}
