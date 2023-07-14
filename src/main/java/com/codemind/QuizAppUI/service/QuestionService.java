package com.codemind.QuizAppUI.service;

import com.codemind.QuizAppUI.dao.QuestionDAO;
import com.codemind.QuizAppUI.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDAO;
    public List<Question> getAllQuestion() {

        return questionDAO.findAll();

    }
}
