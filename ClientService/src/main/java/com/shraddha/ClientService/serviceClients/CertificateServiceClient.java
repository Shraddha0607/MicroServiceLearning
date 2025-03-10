package com.shraddha.ClientService.serviceClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="certificate", url = "http://localhost:8082")
public interface CertificateServiceClient {

    @GetMapping("/api/certificate")
    String fetchCertificate();
}

