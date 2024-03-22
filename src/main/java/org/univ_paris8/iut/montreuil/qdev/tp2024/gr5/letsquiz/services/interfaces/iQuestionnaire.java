package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;

import java.util.Set;

public interface iQuestionnaire {

    public void ajouterQuestion(QuestionDTO question);

    public void supprimerQuestion(QuestionDTO question);

    public Set<QuestionDTO> obtenirQuestions();

    public QuestionDTO trouverQuestionParId(Integer id);

    public Integer obtenirNombreQuestions();


}
