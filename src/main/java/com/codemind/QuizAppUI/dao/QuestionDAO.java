package com.codemind.QuizAppUI.dao;

import com.codemind.QuizAppUI.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends JpaRepository<Question,Integer> {
}
