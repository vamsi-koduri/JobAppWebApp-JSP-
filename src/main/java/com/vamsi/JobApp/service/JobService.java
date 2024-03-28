package com.vamsi.JobApp.service;

import com.vamsi.JobApp.Repo.JobRepo;
import com.vamsi.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public  void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
}
