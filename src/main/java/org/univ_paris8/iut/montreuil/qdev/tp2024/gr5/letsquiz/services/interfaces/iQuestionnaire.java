package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnaireDTO;

import java.util.Set;

public interface iQuestionnaire {

    public void ajouterQuestion(QuestionDTO question, QuestionnaireDTO questionnaire);

    public void supprimerQuestion(QuestionDTO question, QuestionnaireDTO questionnaire);

    public QuestionDTO trouverQuestionParId(Integer id, QuestionnaireDTO questionnaire);

    public Integer obtenirNombreQuestions(QuestionnaireDTO questionnaire);


}
