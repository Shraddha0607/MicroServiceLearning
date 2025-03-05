package com.shraddha.CertificationService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CertificationController {

    @GetMapping("/certificate")
    public String getCertification(){

        return "Hurrah, this is your certificate";
    }
}
