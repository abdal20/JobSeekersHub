package com.javonica.jobSeekersHub.repository;

import com.javonica.jobSeekersHub.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
