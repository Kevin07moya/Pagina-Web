package com.bogotaonline.task.repository;

import com.bogotaonline.task.models.TaskRecord;
import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskRecord, Long> {

    List<TaskRecord> findByStatus(String status);

    List<TaskRecord> findByDateAfterOrderByDate(LocalDate currentDate);

}
