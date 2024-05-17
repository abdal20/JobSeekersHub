package com.javonica.jobSeekersHub.service;

import com.javonica.jobSeekersHub.model.Job;
import com.javonica.jobSeekersHub.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
      return  jobRepository.findById(id);
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }
}
