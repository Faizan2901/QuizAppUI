package com.codemind.QuizAppUI.controller;

import com.codemind.QuizAppUI.model.QuestionWrapper;
import com.codemind.QuizAppUI.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping("/get/{title}")
    public String getQuizQuestion(@PathVariable String title, Model model){

        List<QuestionWrapper> questionWrapperList=quizService.getQuizQuestion(title);

        model.addAttribute("quizQuestion",questionWrapperList);
        return "";
    }

}
