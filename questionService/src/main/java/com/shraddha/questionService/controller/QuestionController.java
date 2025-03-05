package com.shraddha.questionService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuestionController {

    @GetMapping("/question")
    public String getMessage(){

        return "Hurrah, this is your question";
    }
}
