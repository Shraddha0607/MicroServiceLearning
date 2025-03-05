package com.shraddha.ClientService.controller;

import com.shraddha.ClientService.serviceClients.CertificateServiceClient;
import com.shraddha.ClientService.serviceClients.QuestionServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class clientController {

    @Autowired
    QuestionServiceClient questionServiceClient;

    @Autowired
    CertificateServiceClient certificateServiceClient;

    @GetMapping("question")
    public String callQuestionService(){
        return questionServiceClient.fetchQuestion();
    }

    @GetMapping("certificate")
    public String callCertificateService(){
        return certificateServiceClient.fetchCertificate();
    }
}
