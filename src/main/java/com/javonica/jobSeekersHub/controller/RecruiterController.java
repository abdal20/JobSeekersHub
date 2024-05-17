package com.javonica.jobSeekersHub.controller;

import com.javonica.jobSeekersHub.model.Recruiter;
import com.javonica.jobSeekersHub.service.ApplicantService;
import com.javonica.jobSeekersHub.service.RecruiterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/v1/recruiters")
public class RecruiterController {
    private final RecruiterService recruiterService;
    private final ApplicantService applicantService;

    public RecruiterController(RecruiterService recruiterService, ApplicantService applicantService) {
        this.recruiterService = recruiterService;
        this.applicantService = applicantService;
    }
    @GetMapping()
    public List<Recruiter> getAllRecruiters(){
        return recruiterService.getAllRecruiters();
    }
    @GetMapping("/recruiter/{name}")
    public List<Recruiter> getRecruiterByName(@PathVariable String name){
        return recruiterService.getRecruitersByName(name);
    }
}
