package com.javonica.jobSeekersHub.service;

import com.javonica.jobSeekersHub.model.Applicant;
import com.javonica.jobSeekersHub.repository.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantService {
    private final ApplicantRepository applicantRepository;

    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public List<Applicant> getApplicant() {
        return applicantRepository.findAll();
    }

    public Optional<Applicant> getApplicantById(Long id) {
        return applicantRepository.findById(id);
    }

    public Optional<Applicant> createApplicant(Applicant applicant) {
        return Optional.of(applicantRepository.save(applicant));
    }
}

