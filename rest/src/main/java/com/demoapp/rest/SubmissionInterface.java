package com.demoapp.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SubmissionInterface {

     SubmissionForm postSubmission(@RequestBody SubmissionForm sf);
     SubmissionForm getSubmissionFormById(@RequestBody String Id);
    List<SubmissionForm> getallSubmissions();
    SubmissionForm editSubmission(@RequestBody SubmissionForm sf, @PathVariable String Id);
    List<SubmissionForm> deleteSubmission(@RequestBody String Id);








}
