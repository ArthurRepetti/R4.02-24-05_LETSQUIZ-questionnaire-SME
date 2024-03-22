
package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls.QuestionnaireImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.ErreurLectureFichierException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.FichierNonTrouveException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) throws ErreurLectureFichierException, FichierNonTrouveException {

        String cheminFichierCsv = "src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr5/letsquiz/utils/questionsQuizz.csv";

        QuestionnaireImpl serviceQuestionnaire = new QuestionnaireImpl();
        QuestionnairesDTO questionnaires = serviceQuestionnaire.chargerQuestionnaire(cheminFichierCsv);

        for (QuestionnaireDTO questionnaire : questionnaires.getListeQuestionnaires()) {

            System.out.println("Questionnaire ID: " + questionnaire.getId());
            for (QuestionDTO question : questionnaire.getQuestions()) {

                System.out.println("\tNuméro: " + question.getNuméro());
                System.out.println("\tQuestion: " + question.getLibellé());
                System.out.println("\tRéponse: " + question.getRéponse());
                System.out.println("\tExplication: " + question.getExplication());
                System.out.println("\tSource: " + question.getSource());
                System.out.println("\tLangue: " + question.getLangue());
                System.out.println("\tNiveau: " + question.getNiveau());
                System.out.println();
            }
        }
    }
}

