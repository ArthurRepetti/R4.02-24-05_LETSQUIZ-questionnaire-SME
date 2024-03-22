package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnaireDTO;

public interface iQuestionnaire {
    void ajouterQuestion(QuestionDTO question, QuestionnaireDTO questionnaire);
    void supprimerQuestion(QuestionDTO question, QuestionnaireDTO questionnaire);
    QuestionDTO trouverQuestionParId(Integer id, QuestionnaireDTO questionnaire);
    Integer obtenirNombreQuestions(QuestionnaireDTO questionnaire);
}

