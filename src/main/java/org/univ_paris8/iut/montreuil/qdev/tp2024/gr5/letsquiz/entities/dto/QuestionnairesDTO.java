package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class QuestionnairesDTO {

    private List<QuestionnaireDTO> listeQuestionnaires;

    public QuestionnairesDTO() {

        this.listeQuestionnaires = new ArrayList<>();
    }

    public void addQuestionnaire(QuestionnaireDTO questionnaire) {

        this.listeQuestionnaires.add(questionnaire);
    }

    public List<QuestionnaireDTO> getListeQuestionnaires() {

        return this.listeQuestionnaires;
    }
}



