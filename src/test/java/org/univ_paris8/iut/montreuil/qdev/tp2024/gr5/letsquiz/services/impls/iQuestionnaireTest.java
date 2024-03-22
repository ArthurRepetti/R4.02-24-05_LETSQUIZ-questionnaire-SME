package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;

import junit.framework.TestCase;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Niveau;

public class iQuestionnaireTest extends TestCase {


    public void testAjouterQuestion() {
        QuestionDTO question = new QuestionDTO(1, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper?", "Tee", "1","Bah parce que", "https://fr.wikipedia.org/wiki/Matériel_de_golf");
        QuestionnaireDTO questionnaire = new QuestionnaireDTO();

    }

    public void testSupprimerQuestion() {
    }

    public void testTrouverQuestionParId() {
    }

    public void testObtenirNombreQuestions() {
    }
}