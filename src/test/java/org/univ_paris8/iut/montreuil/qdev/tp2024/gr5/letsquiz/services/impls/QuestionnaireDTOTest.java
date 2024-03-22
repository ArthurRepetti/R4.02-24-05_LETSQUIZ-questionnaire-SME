package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.*;

import java.util.List;

public class QuestionnaireDTOTest {

    @Test
    public void testAjoutQuestionEtAutre() {

        QuestionDTO question1 = new QuestionDTO(1, "fr", "libellé1", "réponse1", "1", "explication1", "source1");
        QuestionDTO question2 = new QuestionDTO(2, "fr", "libellé2", "réponse2", "1", "explication2", "source2");
        QuestionDTO question3 = new QuestionDTO(3, "fr", "libellé3", "réponse3", "1", "explication3", "source3");

        QuestionnaireDTO questionnaire = new QuestionnaireDTO(1);

        questionnaire.addQuestion(question1);
        questionnaire.addQuestion(question2);
        List<QuestionDTO> questions = questionnaire.getQuestions();

        Assertions.assertEquals(2, questions.size());
        Assertions.assertTrue(questions.contains(question1));
        Assertions.assertTrue(questions.contains(question2));
        Assertions.assertFalse(questions.contains(question3));
    }
}

