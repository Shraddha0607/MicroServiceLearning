package com.shraddha.ClientService.serviceClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "question", url = "http://localhost:8081")
public interface QuestionServiceClient {


        @GetMapping("/api/question")
        String fetchQuestion();

}
