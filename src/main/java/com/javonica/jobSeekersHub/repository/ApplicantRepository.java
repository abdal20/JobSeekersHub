package com.javonica.jobSeekersHub.repository;

import com.javonica.jobSeekersHub.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
