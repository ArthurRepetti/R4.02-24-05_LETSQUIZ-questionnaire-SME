package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.interfaces.iQuestionnaire;

public class Questionnaire implements iQuestionnaire {
    @Override
    public void ajouterQuestion(QuestionDTO question, QuestionnaireDTO questionnaire) {

    }

    @Override
    public void supprimerQuestion(QuestionDTO question,  QuestionnaireDTO questionnaire) {

    }

    @Override
    public QuestionDTO trouverQuestionParId(Integer id,  QuestionnaireDTO questionnaire) {
        return null;
    }

    @Override
    public Integer obtenirNombreQuestions( QuestionnaireDTO questionnaire) {
        return null;
    }
}
