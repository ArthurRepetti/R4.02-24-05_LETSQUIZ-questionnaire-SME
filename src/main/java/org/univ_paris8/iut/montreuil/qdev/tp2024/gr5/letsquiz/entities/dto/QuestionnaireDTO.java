package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireDTO {
    private Integer id;
    private List<QuestionDTO> questions;

    public QuestionnaireDTO(Integer id) {

        this.id = id;
        this.questions = new ArrayList<>();
    }

    public Integer getId() {

        return this.id;
    }

    public List<QuestionDTO> getQuestions() {

        return this.questions;
    }

    public void addQuestion(QuestionDTO question) {

        this.questions.add(question);
    }
}



