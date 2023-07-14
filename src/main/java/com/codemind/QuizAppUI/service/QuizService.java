package com.codemind.QuizAppUI.service;

import com.codemind.QuizAppUI.dao.QuizDAO;
import com.codemind.QuizAppUI.model.Question;
import com.codemind.QuizAppUI.model.QuestionWrapper;
import com.codemind.QuizAppUI.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDAO quizDAO;

    public List<QuestionWrapper> getQuizQuestion(String title) {

        Optional<Quiz> quiz= Optional.ofNullable(quizDAO.findByTitle(title));

        List<Question> questionsFromDB=quiz.get().getQuestions();

        List<QuestionWrapper> questionForUser=new ArrayList<>();

        for(Question q:questionsFromDB){
            QuestionWrapper questionWrapper=new QuestionWrapper(q.getId(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4(),q.getQuestionTitle());
            questionForUser.add(questionWrapper);
        }

        return questionForUser;

    }
}
