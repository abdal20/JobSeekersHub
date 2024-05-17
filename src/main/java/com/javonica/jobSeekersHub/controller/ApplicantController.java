package com.javonica.jobSeekersHub.controller;

import com.javonica.jobSeekersHub.model.Applicant;
import com.javonica.jobSeekersHub.service.ApplicantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/applicants")
public class ApplicantController {
    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;

    }
    @GetMapping
    public List<Applicant>getApplicants(){
        return applicantService.getApplicant();
    }
    @GetMapping("/applicant/{id}")
    public ResponseEntity<?> getApplicantById(@PathVariable Long id) {
        Optional<Applicant> applicant = applicantService.getApplicantById(id);

        if (applicant.isEmpty()) {
            // Handle the case where the applicant is not found
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(applicant.get());
    }
    @PostMapping("/add")
    public Optional<Applicant> createApplicant(@RequestBody Applicant applicant) {
        return applicantService.createApplicant(applicant);


    }

}
