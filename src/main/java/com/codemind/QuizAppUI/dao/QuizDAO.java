package com.codemind.QuizAppUI.dao;

import com.codemind.QuizAppUI.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDAO extends JpaRepository<Quiz,Integer> {

    Quiz findByTitle(String title);

}
