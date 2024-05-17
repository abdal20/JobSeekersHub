package com.javonica.jobSeekersHub.service;

import com.javonica.jobSeekersHub.model.Recruiter;
import com.javonica.jobSeekersHub.repository.RecruiterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruiterService {
    private final RecruiterRepository recruiterRepository;

    public RecruiterService(RecruiterRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    public List<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }
    public List<Recruiter> getRecruitersByName(String name){
        return recruiterRepository.findByName(name);
    }
}
