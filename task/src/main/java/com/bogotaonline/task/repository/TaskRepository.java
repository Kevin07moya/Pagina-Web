package com.bogotaonline.task.repository;

import com.bogotaonline.task.models.TaskRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskRecord, Long> {
}
