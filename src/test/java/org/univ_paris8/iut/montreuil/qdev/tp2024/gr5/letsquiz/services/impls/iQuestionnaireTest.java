package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;

import junit.framework.TestCase;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnaireDTO;

public class iQuestionnaireTest extends TestCase {

    public void testAjouterQuestion() {
        // Création d'une question
        QuestionDTO question = new QuestionDTO(1, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper?", "Tee", "1","Parce que c'est un support", "https://fr.wikipedia.org/wiki/Matériel_de_golf");
        // Création d'un questionnaire
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        // Création d'un objet questionnaire
        Questionnaire questionnaire = new Questionnaire();

        // Appel de la méthode à tester
        questionnaire.ajouterQuestion(question, questionnaireDTO);

        // Vérification que la question a bien été ajoutée
        assertTrue(questionnaireDTO.getListeDesQuestions().contains(question));
    }

    public void testSupprimerQuestion() {
        // Création d'une question
        QuestionDTO question = new QuestionDTO(1, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper?", "Tee", "1","Parce que c'est un support", "https://fr.wikipedia.org/wiki/Matériel_de_golf");
        // Création d'un questionnaire
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        // Ajout de la question
        questionnaireDTO.getListeDesQuestions().add(question);

        // Création d'un objet questionnaire
        Questionnaire questionnaire = new Questionnaire();

        // Appel de la méthode à tester
        questionnaire.supprimerQuestion(question, questionnaireDTO);

        // Vérification que la question a bien été supprimée
        assertFalse(questionnaireDTO.getListeDesQuestions().contains(question));
    }

    public void testTrouverQuestionParId() {
        // Création d'une question
        QuestionDTO question = new QuestionDTO(1, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper?", "Tee", "1","Parce que c'est un support", "https://fr.wikipedia.org/wiki/Matériel_de_golf");
        // Création d'un questionnaire
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        // Ajout de la question
        questionnaireDTO.getListeDesQuestions().add(question);

        // Création d'un objet questionnaire
        Questionnaire questionnaire = new Questionnaire();

        // Appel de la méthode à tester
        QuestionDTO foundQuestion = questionnaire.trouverQuestionParId(1, questionnaireDTO);

        // Vérification que la question retournée est bien celle attendue
        assertNotNull(foundQuestion);
        assertEquals(question.getNuméro(), foundQuestion.getNuméro());
    }

    public void testObtenirNombreQuestions() {
        // Création d'un questionnaire
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        // Ajout de deux questions
        questionnaireDTO.getListeDesQuestions().add(new QuestionDTO(1, "fr", "Question 1", "Réponse 1", "1","Explication 1", "Source 1"));
        questionnaireDTO.getListeDesQuestions().add(new QuestionDTO(2, "fr", "Question 2", "Réponse 2", "1","Explication 2", "Source 2"));

        // Création d'un objet questionnaire
        Questionnaire questionnaire = new Questionnaire();

        // Appel de la méthode à tester
        int nombreQuestions = questionnaire.obtenirNombreQuestions(questionnaireDTO);

        // Vérification que le nombre de questions est correct
        assertEquals(2, nombreQuestions);
    }
}
