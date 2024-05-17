package com.javonica.jobSeekersHub.repository;

import com.javonica.jobSeekersHub.model.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
    List<Recruiter> findByName(String name);
}
