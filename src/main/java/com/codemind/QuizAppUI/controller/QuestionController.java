package com.codemind.QuizAppUI.controller;

import com.codemind.QuizAppUI.model.Question;
import com.codemind.QuizAppUI.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("/questions")
    public String getAllQuestion(Model model){

        List<Question> questionList=questionService.getAllQuestion();
        model.addAttribute("questions",questionList);
        for(Question em:questionList){
            System.out.println(em);
        }

        return "question-list";

    }

}
